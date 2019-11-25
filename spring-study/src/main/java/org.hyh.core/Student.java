package org.hyh.core;

/**
 * @auther :hyh
 * @desc :
 * @date :2019/11/25
 */
public class Student  {
	String name;

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
