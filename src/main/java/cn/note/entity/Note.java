package cn.note.entity;

import java.io.Serializable;

/**
 * 
 * ʵ�������ƣ��ʼ���Ϣ
 * ��          �ܣ��洢�ʼ���Ϣ��
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-08
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-08
 * �汾�ţ�v1.0
 *
 */
public class Note implements Serializable {

	/**
	 * �ʼ���Ϣ�࣬v1.0�汾
	 */
	private static final long serialVersionUID = 1L;
	private String noteId;        //�ʼ�ID
	private String noteBookId;    //�ʼǱ�ID
	private String userId;        //�û�ID
	private String statusId;      //
	private String typeId;        //����
	private String title;         //����
	private Long createTime;      //����ʱ��
	private Long lastModifyTime;  //����޸�ʱ��
	public String getNoteId() {
		return noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
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
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Long lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public Note() {
		super();
	}
	public Note(String noteId, String noteBookId, String userId, String statusId, String typeId, String title,
			Long createTime, Long lastModifyTime) {
		super();
		this.noteId = noteId;
		this.noteBookId = noteBookId;
		this.userId = userId;
		this.statusId = statusId;
		this.typeId = typeId;
		this.title = title;
		this.createTime = createTime;
		this.lastModifyTime = lastModifyTime;
	}
	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", noteBookId=" + noteBookId + ", userId=" + userId + ", statusId=" + statusId
				+ ", typeId=" + typeId + ", title=" + title + ", createTime=" + createTime + ", lastModifyTime="
				+ lastModifyTime + "]";
	}
	
	
}
