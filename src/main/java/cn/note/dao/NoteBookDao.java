package cn.note.dao;

import java.util.List;

import cn.note.entity.NoteBook;

/**
 * 
 * �ӿ����ƣ��ʼǱ���Ϣץȡ
 * ��          �ܣ�ץȡ�ʼǱ���Ϣ
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-08
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-08
 * �汾�ţ�v1.0
 *
 */
public interface NoteBookDao {
	List<NoteBook> findAllNoteBook();    //��ѯȫ���ʼǱ���Ϣ
	NoteBook findNoteBookByNotebookId(String noteBookId);   //���ݱʼǱ�ID��ѯ�ʼǱ�
	List<NoteBook> findNoteBookByUserId(String userId);   //�����û�����ѯ�ʼǱ���Ϣ
}
