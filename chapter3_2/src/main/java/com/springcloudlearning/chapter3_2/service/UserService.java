package com.springcloudlearning.chapter3_2.service;

import java.util.List;

import com.springcloudlearning.chapter3_2.model.UserDomain;

public interface UserService {
	
	int insert(UserDomain record);

    void deleteUserById(Integer userId);

    void updateUser(UserDomain userDomain);

    List<UserDomain> selectUsers();

}
