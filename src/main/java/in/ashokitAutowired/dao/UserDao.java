package in.ashokitAutowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void save()
	{
		System.out.println("user saved");
	}
}
