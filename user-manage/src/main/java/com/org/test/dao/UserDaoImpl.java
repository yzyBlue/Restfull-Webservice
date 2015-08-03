package com.org.test.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.org.test.model.User;
@Repository("userDao")
public class UserDaoImpl extends AbstractGenericDaoImpl<User,Integer> implements UserDao{
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	public int insertUser(User user){
		log.debug("insert a user: " + user);
		User r=saveReturnId(user);
		return r.getId();
	}
	public String deleteUser(int id){
		log.debug("delete a userid: " + id);
		String result="";
		User user=findById(id);
		if(user!=null||user.getId()>0){
			delete(id);
			result="delete success";
		}else{
			result="no user record";
		}
		return result;
	}
	public List<User> getAllUsers(){
		String hql="from User";
		List<User> users=findByHQL(hql);
		logger.debug("findByHQL");
		for(int i=0;i<users.size();i++){
			logger.info("****************************");
			logger.info(users.get(i).toString());
			logger.info("****************************");
		}
		return users;
	}
}
