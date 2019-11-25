package hyh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther :hyh
 * @desc :
 * @date :2019/11/15
 */
public class TestStart {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User bean = applicationContext.getBean(User.class);
		System.out.println(bean);
	}
}
