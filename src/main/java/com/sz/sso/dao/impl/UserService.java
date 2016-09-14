package com.sz.sso.dao.impl;

import org.hibernate.SessionFactory;

import com.sz.sso.dao.interfaces.IGeneralDao;
import com.sz.sso.dao.services.AbstractHibernateDao;
import com.sz.sso.models.User;
import com.sz.sso.utils.HibernateUtil;

public class UserService extends AbstractHibernateDao<User, Long> implements IGeneralDao<User, Long>{

	public UserService(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public UserService() {
		this(HibernateUtil.getInstance().getSessionFactory());
	}
	
}
