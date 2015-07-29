package com.org.test.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService 
public interface UserService {
	@WebMethod
	public String register(String username,String password);
}
