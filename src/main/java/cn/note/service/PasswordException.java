package cn.note.service;


/**
 * 
 * �쳣�����ƣ������쳣��
 * ��          �ܣ������쳣��Ϣ
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-08
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-08
 * �汾�ţ�v1.0
 *
 */
public class PasswordException extends RuntimeException {

	/**
	 * �����쳣�࣬v1.0�汾
	 */
	private static final long serialVersionUID = 1L;

	public PasswordException() {
		// TODO Auto-generated constructor stub
	}

	public PasswordException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PasswordException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PasswordException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
