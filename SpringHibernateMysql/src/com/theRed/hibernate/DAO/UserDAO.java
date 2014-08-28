package com.theRed.hibernate.DAO;

import com.theRed.hibernate.persistence.User;

public interface UserDAO {
	void save(User user);

	void update(User user);

	void delete(User user);
	
	public java.util.List<User> users();
}
