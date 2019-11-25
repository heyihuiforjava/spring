package org.hyh.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @auther :hyh
 * @desc :
 * @date :2019/11/25
 */

/***
 *   FactoryBean  用于创建对象的， 获取FactoryBean 对象要加上&
 *   BeanFactoryPostProcessor:   用于修改beanDefinition。
 *   BeanPostProcess：  对bean对象创建后 使用。
 */
public class AAAABeanFactoryPostProcessor  implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition bd = (GenericBeanDefinition) beanFactory.getBeanDefinition("AAA");
		if (bd != null) {
			System.out.println("在 BeanFactoryPostPorcessor中修改BeanDefinition");
			  bd.setBeanClass(BBB.class);
		}
	}
}
