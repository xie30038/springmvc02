package cn.note.test01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.note.dao.UserDao;
import cn.note.entity.User;

public class TestDemo01 {

	public static void main(String[] args) {
		//testFindUserAll();
		//testFindByName();
		//testFindUserById();
		//testFindUserByIdAndName();
		testFindUserByIdOrName();
		
		
	}
	
	private static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
	public static void testFindUserAll() {
		UserDao ud = ctx.getBean("userDao",UserDao.class);
		List<User> list = ud.findAll();
		for(User u : list) {
			System.out.println(u);
		}
	}
	public static void testFindByName() {
		UserDao ud = ctx.getBean("userDao",UserDao.class);
		User u = ud.findUserByName("zhoujia");
		System.out.println(u);
	}
	public static void testFindUserById() {
		UserDao ud = ctx.getBean("userDao",UserDao.class);
		User u = ud.findUserById("39295a3d-cc9b-42b4-b206-a2e7fab7e77c");
		System.out.println(u);
	}
	public static void testFindUserByIdAndName() {
		UserDao ud = ctx.getBean("userDao",UserDao.class);
		Map<String,String> map = new HashMap<String, String>();
		map.put("userId", "39295a3d-cc9b-42b4-b206-a2e7fab7e77c");
		map.put("name", "zhoujia");
		List<User> list = ud.findUserByIdAndName(map);
		for(User u : list) {
			System.out.println(u);
		}
	}
	public static void testFindUserByIdOrName() {
		UserDao ud = ctx.getBean("userDao",UserDao.class);
		Map<String,String> map = new HashMap<String, String>();
		map.put("userId", "39295a3d-cc9b-42b4-b206-a2e7fab7e77c");
		map.put("name", "zhouj");
		List<User> list = ud.findUserByIdOrName(map);
		for(User u : list) {
			System.out.println(u);
		}
	}
}






