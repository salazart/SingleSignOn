package com.sz.sso.dao.interfaces;

import java.io.Serializable;
import java.util.List;


public interface IGeneralDao<T extends IEntity, P extends Serializable>{
	public T create(T entity);
	
	public List<T> getAll();
	
	public void delete(T entity);
	
	public T get (P id);
	
	public T update(T entity);
}
