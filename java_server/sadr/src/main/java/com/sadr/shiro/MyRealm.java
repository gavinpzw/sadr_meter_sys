package com.sadr.shiro;

import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.sadr.dao.UsersMapper;
import com.sadr.domain.Users;

public class MyRealm extends AuthorizingRealm{
	@Autowired
	private UsersMapper usersMapper;

	/**
	 * 为当前登录的用户授予角色和权限
	 */
	@Override
	public AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String)principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//		try{
//			authorizationInfo.addRole(userDao.findOneByUserName(userName).getRole().getRoleName());
//			Set<Permission> permissions = permissionDao.findByRole(userDao.findOneByUserName(userName).getRole());
//			Set<String> strs = new HashSet<String>();
//			for (Permission permission : permissions) {
//				strs.add(permission.getPermissionName());
//			}
//			authorizationInfo.addStringPermissions(strs);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		return authorizationInfo;
	}

	/**
	 * 验证当前登录的用户
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String account = (String)token.getPrincipal();
		String password = new String((char[])token.getCredentials());
		
		Users user = usersMapper.getUserByAccount(account);
		if(user!=null && password.equals(user.getPassword()) && user.getEnable()){
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user, user.getPassword(),getName());
			return authcInfo;
		}else{
			throw new AuthenticationException();
		}
	}
}
