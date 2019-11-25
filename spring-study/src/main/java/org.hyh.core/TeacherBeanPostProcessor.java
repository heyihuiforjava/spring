package org.hyh.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @auther :hyh
 * @desc :
 * @date :2019/11/25
 */
public class TeacherBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行 TeacherBeanPostProcessor 的 postProcessBeforeInitialization 的方法");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		if (bean.getClass().getName().equals(Teacher.class.getName())) {
		if (bean instanceof Teacher) {
			System.out.println("修改teacher的name 属性....");
			Teacher teacher = (Teacher) bean;
			   teacher.setTeacherName("苍老师");
			    return  teacher;
		}

		return bean;
	}
}
