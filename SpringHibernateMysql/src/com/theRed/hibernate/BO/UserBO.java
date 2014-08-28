package com.theRed.hibernate.BO;

import com.theRed.hibernate.DAO.UserDAOImpl;
import com.theRed.hibernate.persistence.User;

public class UserBO {
	UserDAOImpl userDAOImpl;

	public void save(User user) {
		this.userDAOImpl.save(user);
	}

	public void update(User user) {
		this.userDAOImpl.update(user);
	}

	public void delete(User user) {
		this.userDAOImpl.delete(user);
	}

	public UserDAOImpl getUserDAOImpl() {
		return userDAOImpl;
	}

	public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}
}
