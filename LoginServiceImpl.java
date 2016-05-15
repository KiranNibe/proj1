package com.ims.serviceImpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.LoginDao;
import com.ims.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	
	private LoginDao loginDao;

	
		@Override
	public boolean login(String name, String pwd) {

		return loginDao.login(name, pwd);
	}

}
