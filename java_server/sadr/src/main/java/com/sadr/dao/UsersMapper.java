package com.sadr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sadr.domain.MenuDo;
import com.sadr.domain.Users;
import com.sadr.domain.UsersExample;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    /*add*/
	Users getUserByAccount(String account);
	
	List<Users> listreview(Users users);
	
	int listreviewCount();

	int listuserCount();

	List<Users> listuser(Users users);
	
	Users searchreview(Users users);
}