package cn.note.service;

import java.util.List;

import cn.note.entity.NoteBook;

/**
 * 
 * �ӿ����ƣ��ʼǱ�ҵ��ӿ�
 * ��          �ܣ��ʼǱ���Ϣ
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-11
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-11
 * �汾�ţ�v1.0
 *
 */
public interface NoteBookService {
	List<NoteBook> findNoteBookByUserId(String userId) throws NoteBookNoteFoundException ;
}
