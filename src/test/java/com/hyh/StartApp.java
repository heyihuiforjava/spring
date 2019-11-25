package com.hyh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @auther :hyh
 * @desc :\
 * @date :2019/11/13
 */
public class StartApp
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		long startupDate = context.getStartupDate();
		System.out.println(startupDate);

	}
}
