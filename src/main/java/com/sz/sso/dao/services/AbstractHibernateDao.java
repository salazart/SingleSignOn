package com.sz.sso.dao.services;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sz.sso.dao.interfaces.IEntity;
import com.sz.sso.dao.interfaces.IGeneralDao;

public class AbstractHibernateDao<T extends IEntity, P extends Serializable> implements IGeneralDao<T,P> {
	protected static final Logger log = LogManager.getRootLogger();

	protected Class<T> clazz;
	protected SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public AbstractHibernateDao(SessionFactory sessionFactory) {
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		this.sessionFactory = sessionFactory;
	}

	@Override
	public T create(T entity) {
		try (Session session = sessionFactory.openSession();) {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
		} catch (Exception e) {
			log.error(e);
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		List<T> entity = null;
		try (Session session = sessionFactory.openSession();) {
			session.beginTransaction();
			entity = (List<T>) session.createQuery("from " + clazz.getName()).getResultList();
			session.getTransaction().commit();
		} catch (Exception e) {
			log.error(e);
		}
		return entity;
	}

	public void delete(T entity) {
		try (Session session = sessionFactory.openSession();) {
			session.beginTransaction();
			session.delete(entity);
			session.getTransaction().commit();
		} catch (Exception e) {
			log.error(e);
		}
	}

	@Override
	public T get(P id) {
		T t = null;
		try (Session session = sessionFactory.openSession();) {
			session.beginTransaction();
			t = session.get(clazz, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			log.error(e);
		}
		return t;
	}

	@Override
	public T update(T entity) {
		try (Session session = sessionFactory.openSession();) {
			session.beginTransaction();
			session.merge(entity);
			session.getTransaction().commit();
		} catch (Exception e) {
			log.error(e);
		}
		return entity;
	}

}
