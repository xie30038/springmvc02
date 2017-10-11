package cn.note.entity;

import java.io.Serializable;
/**
 * 
 * ʵ�������ƣ��û���Ϣ
 * ��          �ܣ��洢�û���Ϣ��
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-05
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-05
 * �汾�ţ�v1.0
 *
 */
public class User implements Serializable {

	/**
	 * �û�ʵ���࣬1.0�汾
	 */
	private static final long serialVersionUID = (long) 1.0;
	
	private String userId;  //�û�ID
	private String userName;    //�û���
	private String password;//����
	private String token;   //�Ự��־
	private String nick;    // �ǳ�
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return userName;
	}
	public void setName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public User(String userId, String userName, String password, String token, String nick) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.token = token;
		this.nick = nick;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", token=" + token + ", nick="
				+ nick + "]";
	}
	
}
