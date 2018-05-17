package top.chgl16.myspring.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Lin 2018-5-15
 * 这是另外新建的一个类，来实现BeanPostProcessor接口,Before和After方法具有AOP特性，所以如此关联建立
 * afterPropertiesSet()方法是InitializingBean接口的，周期中排在Before后面，全局比较奇怪，姑还是在相应的Bean类里实现为好
 * 这个类也要配置为Bean
 */

public class MyBeanPostProcessor implements BeanPostProcessor, InitializingBean {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("bean生命周期第九步，postProcessAfterInitialization 被调用    arg1:" + arg0);
		System.out.println("\n");
		return arg0;    // before和after都要放回 arg0或者对象，弄人 return null, 马上空指针异常
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("bean生命周期第六步，postProcessBeforeInitialization 被调用  arg1:" + arg1);
		return arg0;   // before和after都要放回 arg0或者对象，弄人 return null, 马上空指针异常
	}

	// 这里的这个方法不会被调用，没有aop功能 
	public void afterPropertiesSet() throws Exception {		
		System.out.println("InitializingBean接口, 很奇怪在首先调用了，设置属性前");
	}

}
