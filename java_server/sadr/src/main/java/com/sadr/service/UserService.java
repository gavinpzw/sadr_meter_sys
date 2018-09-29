package com.sadr.service;

import java.util.List;

import com.sadr.domain.MenuDo;
import com.sadr.domain.Users;

public interface UserService {
	public Users getUserByAccount(String username);
	
	public int register(Users user);
	
	public int review(Users user);
	
	public List<Users> listreview(Users users);

	public int listreviewCount();

	public int listuserCount();

	public List<Users> listuser(Users users);
	
	 int updateByPrimaryKeySelective(Users record);

	public List<MenuDo> getmenu(Integer companyId);

	public Users searchreview(Users users);
}
