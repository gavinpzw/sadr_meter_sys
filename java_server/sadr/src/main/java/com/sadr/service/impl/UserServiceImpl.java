package com.sadr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadr.dao.MenuMapper;
import com.sadr.dao.UsersMapper;
import com.sadr.domain.MenuDo;
import com.sadr.domain.Users;
import com.sadr.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private MenuMapper muneMapper;
	
	@Override
	public Users getUserByAccount(String username) {
		return usersMapper.getUserByAccount(username);
	}

	@Override
	public int register(Users user) {
		return usersMapper.insertSelective(user);
	}

	@Override
	public int review(Users user) {
		return usersMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public List<Users> listreview(Users users) {
		return usersMapper.listreview(users);
	}

	@Override
	public int listreviewCount() {
		// TODO Auto-generated method stub
		return usersMapper.listreviewCount();
	}

	@Override
	public int listuserCount() {
		// TODO Auto-generated method stub
		return usersMapper.listuserCount();
	}

	@Override
	public List<Users> listuser(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.listuser(users);
	}

	@Override
	public int updateByPrimaryKeySelective(Users record) {
		// TODO Auto-generated method stub
		return usersMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<MenuDo> getmenu(Integer companyId) {
		// TODO Auto-generated method stub
		return muneMapper.getmenu(companyId);
	}

	@Override
	public Users searchreview(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.searchreview(users);
	}
}
