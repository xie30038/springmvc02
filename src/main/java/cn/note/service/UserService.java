package cn.note.service;

import cn.note.entity.User;

public interface UserService {
	User login(String name,String password) throws NameException,PasswordException;
}
