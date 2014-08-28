package com.theRed.hibernate.persistence;

import java.sql.Timestamp;

public class Own {
	private int own_id;
	private User user;
	private Mobile mobile;
	private Timestamp timestamp;

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public int getOwn_id() {
		return own_id;
	}

	public void setOwn_id(int own_id) {
		this.own_id = own_id;
	}
}
