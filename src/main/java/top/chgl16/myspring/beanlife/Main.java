package top.chgl16.myspring.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Lin 2018-5-15
 * Bean声明周期的第十一步是 关闭容器，十二步是实现销毁方法，十三步是自定义销毁方法。但是都是不可见的，关闭了
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("top/chgl16/myspring/beanlife/beans.xml");
		Person person1 = (Person) ac.getBean("person");
		
		
		System.out.println("bean生命周期第十步，Hello " + person1.getName());
		
		Person person2 = (Person) ac.getBean("person");
	}

}
