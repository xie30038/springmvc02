package cn.note.service;


/**
 * 
 * �쳣�����ƣ��û��쳣��
 * ��          �ܣ��û��쳣����Ϣ
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-12
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-12
 * �汾�ţ�v1.0
 *
 */
public class UserNotFoundException extends RuntimeException {

	/**
	 * �û��쳣�ࣺv1.0
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
