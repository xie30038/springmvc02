package cn.note.service;

import org.springframework.stereotype.Service;

import cn.note.entity.User;


/**
 * 
 * �ӿ����ƣ��û�ҵ��ӿ�
 * ��          �ܣ��û�ҵ��
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-12
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-12
 * �汾�ţ�v1.0
 *
 */

@Service("userService")
public interface UserService {
	User login(String name,String password) throws NameException,PasswordException;
}
