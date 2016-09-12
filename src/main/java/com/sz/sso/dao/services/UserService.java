package com.sz.sso.dao.services;

import org.hibernate.SessionFactory;

import com.sz.sso.dao.interfaces.IGeneralDao;
import com.sz.sso.models.User;
import com.sz.sso.utils.HibernateUtil;

public class UserService extends AbstractHibernateDao<User> implements IGeneralDao<User>{

	public UserService(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public UserService() {
		this(HibernateUtil.getInstance().getSessionFactory());
	}
	
}
