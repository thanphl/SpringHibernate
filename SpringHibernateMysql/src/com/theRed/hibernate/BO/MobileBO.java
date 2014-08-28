package com.theRed.hibernate.BO;

import com.theRed.hibernate.DAO.MobileDAOImpl;
import com.theRed.hibernate.persistence.Mobile;

public class MobileBO {
	MobileDAOImpl mobileDAOImpl;

	public void save(Mobile mobile) {
		this.mobileDAOImpl.save(mobile);
	}

	public void update(Mobile mobile) {
		this.mobileDAOImpl.update(mobile);
	}

	public void delete(Mobile mobile) {
		this.mobileDAOImpl.delete(mobile);
	}

	public MobileDAOImpl getMobileDAOImpl() {
		return mobileDAOImpl;
	}

	public void setMobileDAOImpl(MobileDAOImpl mobileDAOImpl) {
		this.mobileDAOImpl = mobileDAOImpl;
	}
}
