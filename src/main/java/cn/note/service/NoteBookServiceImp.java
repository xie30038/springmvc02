package cn.note.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.note.dao.NoteBookDao;
import cn.note.dao.UserDao;
import cn.note.entity.NoteBook;

@Service("noteBookService")
public class NoteBookServiceImp implements NoteBookService {
	
	@Resource
	private UserDao ud;
	@Resource
	private NoteBookDao nbd;
	public List<NoteBook> findNoteBookByUserId(String userId) throws NoteBookNoteFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
