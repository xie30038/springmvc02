package cn.note.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.note.service.UserNotFoundException;
import cn.note.service.UserService;
import cn.note.util.JsonResult;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource
	private UserService us;
	
	@ResponseBody
	@RequestMapping("verifyname.do")
	public JsonResult VerUseerName(String name) {
		return new JsonResult(us.findUserByName(name));
	}
	
	@ResponseBody
	@ExceptionHandler(UserNotFoundException.class)
	public JsonResult userExp(UserNotFoundException e) {
		e.printStackTrace();
		String expMsg = e.getMessage();
		if(expMsg==null || expMsg.trim().equals("")) {
			return new JsonResult(e);
		}else if(expMsg.trim().equals("用户不存在")) {
			return new JsonResult(2, e);
		}else if(expMsg.trim().equals("用户名不能为空")) {
			return new JsonResult(3, e);
		}else {
			return new JsonResult(1,e);
		}
		
		
	}

}
