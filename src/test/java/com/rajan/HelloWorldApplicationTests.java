package com.rajan.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.rajan.HelloWorldApplication;

public class HelloWorldApplicationTests {
	
	@Test
	public void test1() {
		HelloWorldApplication obj = new HelloWorldApplication();
		String data = "NoName";
		String res = obj.echo(data);
		
		assertEquals("Failed",data,res);
		
	}

}

