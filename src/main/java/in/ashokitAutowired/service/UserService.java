package in.ashokitAutowired.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokitAutowired.dao.UserDao;


@Service
public class UserService {

@Autowired	
	private UserDao userDao;
	

	public void saveUser()
	{
		userDao.save();
	System.out.println("save user service");	
	}
}
