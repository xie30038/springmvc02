package cn.note.dao;

import java.util.List;
import java.util.Map;

import cn.note.entity.User;

/**
 * 
 * �ӿ����ƣ��û���Ϣץȡ
 * ��          �ܣ�ץȡ�û���Ϣ
 * ��          �ߣ�paperElephant
 * ����ʱ�䣺2017-10-08
 * ���ά���ˣ�paperElephant
 * ���ά��ʱ�䣺2017-10-08
 * �汾�ţ�v1.0
 *
 */
public interface UserDao {
	List<User> findAll();  //��ѯȫ���û���Ϣ
	User findUserByName(String name);  //ͨ���û�����ѯ�û���Ϣ
	User findUserById(String userId);  //�����û�ID��ѯ�û���Ϣ
	List<User> findUserByIdAndName(Map<String,String> map);  //����ID���û�����ѯ�û���Ϣ
	List<User> findUserByIdOrName(Map<String,String> map);   //����ID���û�����ѯ�û���Ϣ
	int addUser(User u);    //�����û�
	int deleteByName(String name);  //ɾ���û�
	
}
