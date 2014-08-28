package com.theRed.hibernate.DAO;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.theRed.hibernate.persistence.Mobile;

public class MobileDAOImpl implements MobileDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Mobile mobile) {
		hibernateTemplate.save(mobile);
	}

	@Override
	public void update(Mobile mobile) {
		hibernateTemplate.update(mobile);
	}

	@Override
	public void delete(Mobile mobile) {
		hibernateTemplate.delete(mobile);
	}

}
