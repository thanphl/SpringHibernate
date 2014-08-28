package com.theRed.hibernate.DAO;

import com.theRed.hibernate.persistence.Own;

public interface OwnDAO {
	void save(Own own);

	void update(Own own);

	void delete(Own own);
}
