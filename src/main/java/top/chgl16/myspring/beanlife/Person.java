package top.chgl16.myspring.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * @Lin 2018-5-15
 * 测试全部周期的一个bean
 *
 */
public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("bean生命周期第二步， 属性注入，setXxx()方法");
	}
	
	public Person() {
		System.out.println("bean生命周期第一步, 实例化对象，调用了Person的构造函数");
	}

	public void setBeanName(String arg0) {
		// bean生命周期第三步，BeanNameAware接口，实现其setBeanName方法， arg0是Bean的name/id
		System.out.println("bean生命周期第三步,BeanNameAware接口，实现其setBeanName方法    arg0: " + arg0);
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// bean生命周期第四步，BeanFactoryAware接口，实现其setBeanFactory方法， arg0是BeanFactory对象
		System.out.println("bean生命周期第四步，BeanFactoryAware接口，实现其setBeanFactory方法， arg0: " + arg0);
		
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// bean生命周期第五步，ApplicationContextAware接口，实现其setApplicationContext方法， arg0是ApplicationContext对象
		System.out.println("bean生命周期第五步，ApplicationContextAware接口，实现其setApplicationContext方法， arg0: " + arg0);
		
	}

	/*
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization");
		return null;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization");
		return null;
	}
	*/
	public void init() {
		System.out.println("bean生命周期第八步，自定义的初始化方法，在配置中 init-method=\"init\"");
	}
	
	public void afterPropertiesSet() throws Exception {
		// 不具备AOP
		System.out.println("bean生命周期第七步，InitializingBean 接口");
	}

	public void destroy() throws Exception {
		// 可以关闭数据连接，等。。但是看不到显示，定制的方法可以显示
		System.out.println("bean生命周期第十二步，调用DisposableBean接口的destroy()方法");
	}
	
	// 定制的销毁方法
	public void myDestroy() {
		// 自定义的销毁方法，也是看不到的  最后一步
		System.out.println("bean生命周期第十三步，调用自定义的方法 ，在配置中 destroy-method=\\\"myDestroy\\\"");
	}
}
