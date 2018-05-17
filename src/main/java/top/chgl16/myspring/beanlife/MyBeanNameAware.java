package top.chgl16.myspring.beanlife;

import org.springframework.beans.factory.BeanNameAware;

/**	
 * @Lin 2018-5-15
 * 只有BeanPostProcessor才具有AOP全局性，这个声明周期第三步的获取BeanName和其他都没有，所以这个函数不会被其他bean调用运行
 * 
 */

public class MyBeanNameAware implements BeanNameAware {

	
	public void setBeanName(String arg0) {
		System.out.println("测试 MyBeanNameAware, 配置后被当做一个单独的bean而已");

	}

}
