package com.org.test.service;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import org.apache.log4j.Logger;
import com.org.test.dao.BookDao;
import com.org.test.dao.UserDao;
import com.org.test.model.Book;
import com.org.test.model.User;
import com.org.test.model.UserBook;

@Path("/userService")
@Transactional
public class UserServiceRest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Resource(name = "userDao")
	private UserDao userDao;
	@Resource(name = "bookDao")
	private BookDao bookDao;
    @Context
    private Request request;
    @Context
    private UriInfo uriInfo;
    
	@GET
    @Path("/getAllUserData")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<User> getAllUserData(){
		List<User> userlist=userDao.getAllUsers();
		return userlist;
	}
	
	@GET
    @Path("/getUserData")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public User getUserData(@QueryParam("id") int id) {
		User user=userDao.findById(id);
		logger.info("****************************");
		logger.info(user.toString());
		logger.info("****************************");
		
		if (user==null||user.getId()==0){
			return null;
		}else{
			return user;
		}
	}
    @PUT
    @Path("/putData")
    @Produces({ MediaType.APPLICATION_XML })
    @Consumes("application/xml")
	public User putUserData(User user){
    	logger.info("****************************");
		logger.info(user.toString());
		logger.info("****************************");
    	User userN=userDao.saveReturnId(user);
		return userN;
	}
    @DELETE
    @Path("/deleteData/{id}")
    @Produces({ MediaType.TEXT_PLAIN })
    public String deleteDate(@PathParam("id") String id){
    	String result=userDao.deleteUser(Integer.parseInt(id));
    	return result;
    }
    
    @PUT
    @Path("/UserBook")
    @Produces({ MediaType.APPLICATION_XML })
    @Consumes("application/xml")
	public String putUserBook(UserBook userBook){
    	logger.info("****************************");
		logger.info(userBook.getUser().toString());
		logger.info(userBook.getBook().toString());
		logger.info("****************************");
    	User userN=userDao.saveReturnId(userBook.getUser());
    	Book bookN=bookDao.saveReturnId(userBook.getBook());
    	String result="Failed";
    	if(userN.getId()>0&&bookN.getBookId()>0){
    		result="Success";
    	}
		return result;
	}
    @GET
    @Path("/getUserBook")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public UserBook getUserBook(@QueryParam("userid") final int userid,@QueryParam("bookid") final int bookid) {
		User user=userDao.findById(userid);
		logger.info("****************************");
		logger.info(user.toString());
		logger.info("****************************");
		logger.info(bookid);
		Book book=bookDao.findById(bookid);
		logger.info("****************************");
		//logger.info(bookid);
		logger.info("****************************");
		UserBook userBook=new UserBook();
		if(book==null){
			logger.info("book 为空值");
			Book booknew= new Book();
			booknew.setBookId(0);
			booknew.setBookCode("null");
			booknew.setBookName("null");
			userBook.setBook(booknew);
			userBook.setUser(user);
		}else{
			userBook.setBook(book);
			userBook.setUser(user);
		}
		
		if (userBook==null||(user==null&&book==null)){
			return userBook;
		}else{
			return userBook;
		}
		
	}
    @GET
    @Path("/getBookData/{bookid}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Book getBookData(@PathParam("bookid") int bookid) {
    	Book book=bookDao.findById(bookid);
		logger.info("****************************");
		logger.info(book.toString());
		logger.info("****************************");
		
		if (book==null||book.getBookId()==0){
			return null;
		}else{
			return book;
		}
	}
    @GET
    @Path("/getBookData2")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Book getBookData2(@QueryParam("bookid") int bookid) {
    	Book book=bookDao.findById(bookid);
		logger.info("****************************");
		logger.info(book.toString());
		logger.info("****************************");
		
		if (book==null||book.getBookId()==0){
			return null;
		}else{
			return book;
		}
	}
    @PUT
    @Path("/UserBook2")
    @Produces({ MediaType.APPLICATION_XML })
    @Consumes("application/xml")
	public String putUserBook2(User user,Book book){
    	logger.info("****************************");
		logger.info(user.toString());
		logger.info(book.toString());
		logger.info("****************************");
    	User userN=userDao.saveReturnId(user);
    	Book bookN=bookDao.saveReturnId(book);
    	String result="Failed";
    	if(userN.getId()>0&&bookN.getBookId()>0){
    		result="Success";
    	}
		return result;
	}
}
