package org.hyh.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther :hyh
 * @desc :
 * @date :2019/11/22
 */
public class Test {

	public static void main(String[] args) {


		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		User bean = applicationContext.getBean(User.class);
		System.out.println(bean);
	}
}
