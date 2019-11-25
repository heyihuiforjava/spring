package org.hyh.core;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther :hyh
 * @desc :
 * @date :2019/11/25
 */
public class Teacher {

	@Autowired
	private User user;

	private  String teacherName;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"user=" + user +
				", teacherName='" + teacherName + '\'' +
				'}';
	}
}
