package com.sz.sso.dao.interfaces;

import java.util.List;


public interface IGeneralDao<T extends IEntity>{
	public T create(T entity);
	
	public List<T> getAll();
	
	public void delete(T entity);
}
