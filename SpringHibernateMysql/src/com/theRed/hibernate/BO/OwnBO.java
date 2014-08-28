package com.theRed.hibernate.BO;

import com.theRed.hibernate.DAO.OwnDAOImpl;
import com.theRed.hibernate.persistence.Own;

public class OwnBO {
	OwnDAOImpl ownDAOImpl;

	public void save(Own own) {
		this.ownDAOImpl.save(own);
	}

	public void update(Own own) {
		this.ownDAOImpl.update(own);
	}

	public void delete(Own own) {
		this.ownDAOImpl.delete(own);
	}

	public OwnDAOImpl getOwnDAOImpl() {
		return ownDAOImpl;
	}

	public void setOwnDAOImpl(OwnDAOImpl ownDAOImpl) {
		this.ownDAOImpl = ownDAOImpl;
	}
}
