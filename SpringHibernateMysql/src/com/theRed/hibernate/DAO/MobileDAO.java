package com.theRed.hibernate.DAO;

import com.theRed.hibernate.persistence.Mobile;

public interface MobileDAO {
	void save(Mobile mobile);

	void update(Mobile mobile);

	void delete(Mobile mobile);
}
