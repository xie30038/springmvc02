package cn.note.service;


/**
 * 
 * 异常类名称：用户异常类
 * 功          能：用户异常类信息
 * 作          者：paperElephant
 * 创建时间：2017-10-12
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-12
 * 版本号：v1.0
 *
 */
public class UserNotFoundException extends RuntimeException {

	/**
	 * 用户异常类：v1.0
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
