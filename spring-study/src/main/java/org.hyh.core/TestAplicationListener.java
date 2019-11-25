package org.hyh.core;

import org.springframework.context.ApplicationListener;

/**
 * @auther :hyh
 * @desc :  //测试 事件监听
 * @date :2019/11/25
 */
public class TestAplicationListener  implements ApplicationListener<TestApplicationEvent> {
	@Override
	public void onApplicationEvent(TestApplicationEvent event) {
		System.out.println("监听到了事件。。。。");
		event.testMethod();
	}
}
