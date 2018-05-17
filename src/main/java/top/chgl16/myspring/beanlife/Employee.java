package top.chgl16.myspring.beanlife;

/**
 * 
 * @Lin 2018-5-15
 * 为了测试的草稿bean类
 *
 */

public class Employee {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Employee() {
		System.out.println("bean生命周期第一步, 实例化对象，调用了Employee的构造函数");
	}

}
