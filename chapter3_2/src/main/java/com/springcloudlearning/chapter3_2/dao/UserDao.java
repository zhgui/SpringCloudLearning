package com.springcloudlearning.chapter3_2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springcloudlearning.chapter3_2.model.UserDomain;

@Mapper
public interface UserDao {
	
	int insert(UserDomain record);

	void deleteUserById(@Param("userId") Integer userId);

	void updateUser(UserDomain userDomain);

	List<UserDomain> selectUsers();

}
