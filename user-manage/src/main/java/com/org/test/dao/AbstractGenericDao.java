package com.org.test.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
/**
 * AbstractGeneric DAO (Data Access Object) with common methods to CRUD POJOs.
 *
 * <p>Extend this interface if you want typesafe (no casting necessary) DAO's for your
 * domain objects.
 *
 * @author <a href="mailto:bluedelta9192@gmail.com">Yuan.Ziyang</a>
 * @param <T> a type variable
 * @param <PK> the primary key for that type
 */
public interface AbstractGenericDao <T, PK extends Serializable>{
	
	public void save(T entity);

	public void update(T entity);

	public void saveOrUpdate(T entity);

	public void delete(PK id);

	public void delete(T entity);
	
	public T load(PK id);

	public T saveReturnId(T entity);
	
	public T findById(PK id);

	public List<?> findByHQL(String hql, Object... params);

	public List<?> findByHQL(String hql, Map<String, ?> map);
	
	public T findUniqueByProperty(String propertyName, Object value);
}
