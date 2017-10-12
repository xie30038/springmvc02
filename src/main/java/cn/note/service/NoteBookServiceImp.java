package cn.note.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.note.dao.NoteBookDao;
import cn.note.dao.UserDao;
import cn.note.entity.NoteBook;

/**
 * 
 * ҵ�������ƣ��ʼǱ�ҵ����
 * ��          �ܣ��ʼǱ�ҵ����Ϣ
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-12
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-12
 * �汾�ţ�v1.0
 *
 */

@Service("noteBookService")
public class NoteBookServiceImp implements NoteBookService {
	
	@Resource
	private UserDao ud;
	@Resource
	private NoteBookDao nbd;
	
	//ͨ���û�ID���ұʼǱ�
	public List<NoteBook> findNoteBookByUserId(String userId) throws NoteBookNoteFoundException {
		if(userId == null || userId.trim().equals("")) {
			throw new UserNotFoundException("�û�Id����Ϊ��");
		}
		if(ud.findUserById(userId) == null) {
			throw new NoteBookNoteFoundException("�û�������");
		}
		return nbd.findNoteBookByUserId(userId);
	}

}
