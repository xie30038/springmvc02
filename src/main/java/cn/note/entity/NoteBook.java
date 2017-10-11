package cn.note.entity;

import java.io.Serializable;
/**
 * 
 * ʵ�������ƣ��ʼǱ���Ϣ
 * ��          �ܣ��洢�ʼǱ���Ϣ��
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-05
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-05
 * �汾�ţ�v1.0
 *
 */
public class NoteBook implements Serializable {

	/**
	 * �ʼǱ���Ϣ�࣬1.0�汾
	 */
	private static final long serialVersionUID = 1L;
	private String noteBookId;  //�ʼǱ�ID
	private String userId;      //�û�����
	private String typeId;      //�ʼǱ�����
	private String noteBookName;//�ʼǱ�����
	private String desc;        //
	private Long createTime;  //����ʱ��
	public String getNoteBookId() {
		return noteBookId;
	}
	public void setNoteBookId(String noteBookId) {
		this.noteBookId = noteBookId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getNoteBookName() {
		return noteBookName;
	}
	public void setNoteBookName(String noteBookName) {
		this.noteBookName = noteBookName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public NoteBook() {
		super();
	}
	public NoteBook(String noteBookId, String userId, String typeId, String noteBookName, String desc,
			Long createTime) {
		super();
		this.noteBookId = noteBookId;
		this.userId = userId;
		this.typeId = typeId;
		this.noteBookName = noteBookName;
		this.desc = desc;
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "NoteBook [noteBookId=" + noteBookId + ", userId=" + userId + ", typeId=" + typeId + ", noteBookName="
				+ noteBookName + ", desc=" + desc + ", createTime=" + createTime + "]";
	}
	
	
}
