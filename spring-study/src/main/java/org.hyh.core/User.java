package org.hyh.core;

import org.springframework.context.annotation.DependsOn;

/**
 * @auther :hyh
 * @desc :
 * @date :2019/11/22
 */

public class User {

//	@DependsOn
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
