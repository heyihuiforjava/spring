package org.hyh.core;

import org.springframework.beans.factory.FactoryBean;

/**
 * @auther :hyh
 * @desc :
 * @date :2019/11/25
 */
public class StudentFactoryBean implements FactoryBean<Student> {
	@Override
	public Student getObject() throws Exception {
		Student student = new Student();
		student.setName("学生");
		return student;
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}
}
