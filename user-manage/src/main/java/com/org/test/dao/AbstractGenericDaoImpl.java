package com.org.test.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.org.test.dao.AbstractGenericDao;

/**
 * This class serves as the Base class for all other DAOs - namely to hold
 * common CRUD methods that they might all use. You should only need to extend
 * this class when your require custom CRUD logic.
 *
 * <p>To register this class in your Spring context file, use the following XML.
 * <pre>
 *      &lt;bean id="genericDao" class="com.zju.edu.empi.dao.AbstractGenericDaoImpl"&gt;
 *          &lt;constructor-arg value="com.zju.edu.empi.model.PatientLog"/&gt;
 *          &lt;property name="sessionFactory" ref="sessionFactory"/&gt;
 *      &lt;/bean&gt;
 * </pre>
 *
 * @author <a href="mailto:bluedelta9192@gmail.com">Yuan.Ziyang</a>
 * @param <T> a type variable
 * @param <PK> the primary key for that type
 */
public abstract class AbstractGenericDaoImpl<T, PK extends Serializable> implements AbstractGenericDao<T, PK>{
	/**
     * Log variable for all child classes. Uses LogFactory.getLog(getClass()) from Commons Logging
     */
    protected final Log log = LogFactory.getLog(getClass());
    private Class<T> persistentClass;

 
    /**
	 * Constructor that takes in a class to see which type of entity to persist
	 */
	public AbstractGenericDaoImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		persistentClass = (Class<T>) type.getActualTypeArguments()[0];
		// System.out.println("DAO的真实实现类是：" + this.clazz.getName());
	}
	
	/**
     * Constructor that takes in a class to see which type of entity to persist
     * @param persistentClass the class type you'd like to persist
     * @return 
     */
	/*
    public AbstractGenericDaoImpl(final Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }
    */
	
	
	/**
	 * Inject SessionFactory into DAO 
	 */
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * Get current Session
	 */
	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	/*
	 * Override common methods to CRUD POJOs.
	 * 
	 * */
	public void save(T entity) {
		this.getSession().save(entity);
	}

	public void update(T entity) {
		this.getSession().update(entity);
	}

	public void saveOrUpdate(T entity) {
		this.getSession().saveOrUpdate(entity);
	}

	public void delete(PK id) {
		this.getSession().delete(this.findById(id));
	}

	public void delete(T entity) {
		this.getSession().delete(entity);
	}
	
	public T load(PK id){
		return (T) this.getSession().load(this.persistentClass,id);
	}
	
	public T saveReturnId(T entity){
		this.getSession().save(entity);
		return entity;
	}
	
	
	public T findById(PK id) {
		return (T) this.getSession().get(this.persistentClass, id);
	}

	public List findByHQL(String hql, Object... params) {
		Query query = this.getSession().createQuery(hql);
		for (int i = 0; params != null && i < params.length; i++) {
			query.setParameter(i, params);
		}
		return query.list();
	}

	public List findByHQL(String hql, Map<String, ?> map) {
		Query query = this.getSession().createQuery(hql);
		query.setProperties(map);
		return query.list();
	}
	public T findUniqueByProperty(String propertyName, Object value) {
		Criteria criteria = this.getSession().createCriteria(persistentClass)
				.add(Restrictions.eq(propertyName, value)); // 增加属性相等约束
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return (T) criteria.uniqueResult();
	}
}
