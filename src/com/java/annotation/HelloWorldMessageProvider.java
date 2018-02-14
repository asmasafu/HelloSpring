package com.java.annotation;

import org.springframework.stereotype.Service;

import com.java.MessageProvider;
@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider{
	public String getMessage() {
		return "Hello World!";
		}
}
