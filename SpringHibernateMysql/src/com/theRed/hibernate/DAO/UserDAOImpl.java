package com.theRed.hibernate.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.theRed.hibernate.persistence.User;

public class UserDAOImpl implements UserDAO {

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(User user) {
		hibernateTemplate.save(user);
	}

	@Override
	public void update(User user) {
		hibernateTemplate.update(user);
	}

	@Override
	public void delete(User user) {
		hibernateTemplate.delete(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> users() {
		return hibernateTemplate.find("from User");
	}


}