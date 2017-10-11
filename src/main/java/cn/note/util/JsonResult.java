package cn.note.util;

import java.io.Serializable;


/**
 * 
 * ���������ƣ�Json�����Ϣ��
 * ��          �ܣ�Json��Ϣ����
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-10
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-10
 * �汾�ţ�v1.0
 *
 */
public class JsonResult implements Serializable {

	/**
	 * json�����Ϣ��:v1.0
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int SUCCESS = 0;  //����״̬�ɹ�
	public static final int ERROR = 1;    //����״̬ʧ��
	private int state;   //״̬
	private Object data;  //��������
	private String message;  //������Ϣ
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public JsonResult() {
		super();
	}
	public JsonResult(int state,String message) {
		super();
		this.state = state;
		this.message = message;
		this.data = null;
	}
	public JsonResult(int state,Throwable e) {
		super();
		this.state = state;
		this.message = e.getMessage();
		this.data = null;
	}
	public JsonResult(int state,Object data) {
		super();
		this.state = state;
		this.data = data;
		this.message = "";
	}
	public JsonResult(Object data) {
		super();
		this.state = SUCCESS;
		this.data = data;
		this.message = "";
	}
	public JsonResult(Throwable e) {
		this.state = ERROR;
		this.message = e.getMessage();
		this.data = null;
	}

}
