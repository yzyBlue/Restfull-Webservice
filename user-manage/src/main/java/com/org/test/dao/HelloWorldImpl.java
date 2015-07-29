package com.org.test.dao;

import org.springframework.stereotype.Repository;

@Repository("helloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String helloWorld(String who) {
		// TODO Auto-generated method stub
		return "Hello World :"+who;
	}

}
