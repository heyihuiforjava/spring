package org.hyh.core;

import org.springframework.context.ApplicationEvent;

/**
 * @auther :hyh
 * @desc :   //定义一个事件。
 * @date :2019/11/25
 */
public class TestApplicationEvent extends ApplicationEvent {
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public TestApplicationEvent(Object source) {
		super(source);
	}

	public void   testMethod(){
		System.out.println("当执行了此方法，说明被对应的监听器 监听到了。。。。");
	}
}
