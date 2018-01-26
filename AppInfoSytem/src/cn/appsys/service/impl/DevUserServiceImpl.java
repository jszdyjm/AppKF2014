package cn.appsys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.DevUserMapper;
import cn.appsys.pojo.BackendUser;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.DevUserService;

@Service
public class DevUserServiceImpl implements DevUserService {
	@Resource
	private DevUserMapper devUserMapper;
	@Override
	public DevUser login(String devCode, String devPassword) throws Exception {
		BackendUser user = null;
		user = devUserMapper.getLoginUser(devCode);
		if(null != user){//登录成功
			if(!devPassword.equals(user.getUserPassword())){//验证密码
				user = null;
			}
		}
		return user;
	}

}
