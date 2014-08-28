package com.theRed.hibernate.DAO;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.theRed.hibernate.persistence.Own;

public class OwnDAOImpl implements OwnDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Own own) {
		hibernateTemplate.save(own);
	}

	@Override
	public void update(Own own) {
		hibernateTemplate.update(own);
	}

	@Override
	public void delete(Own own) {
		hibernateTemplate.delete(own);
	}

}