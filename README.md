# Spring-Bean-lifecycle
Spring Bean生命周期的学习

Console:
bean生命周期第一步, 实例化对象，调用了Person的构造函数
bean生命周期第二步， 属性注入，setXxx()方法
bean生命周期第三步,BeanNameAware接口，实现其setBeanName方法    arg0: person
bean生命周期第四步，BeanFactoryAware接口，实现其setBeanFactory方法， arg0: org.springframework.beans.factory.support.DefaultListableBeanFactory@3567135c: defining beans [person,employee,myBeanPostProcessor,myBeanNameAware]; root of factory hierarchy
bean生命周期第五步，ApplicationContextAware接口，实现其setApplicationContext方法， arg0: org.springframework.context.support.ClassPathXmlApplicationContext@433c675d: startup date [Thu May 17 17:43:45 CST 2018]; root of context hierarchy
bean生命周期第六步，postProcessBeforeInitialization 被调用  arg1:person
bean生命周期第七步，InitializingBean 接口
bean生命周期第八步，自定义的初始化方法，在配置中 init-method="init"
bean生命周期第九步，postProcessAfterInitialization 被调用    arg1:top.chgl16.myspring.beanlife.Person@6500df86


bean生命周期第一步, 实例化对象，调用了Employee的构造函数
bean生命周期第六步，postProcessBeforeInitialization 被调用  arg1:employee
bean生命周期第九步，postProcessAfterInitialization 被调用    arg1:top.chgl16.myspring.beanlife.Employee@4cf777e8


测试 MyBeanNameAware, 配置后被当做一个单独的bean而已
bean生命周期第六步，postProcessBeforeInitialization 被调用  arg1:myBeanNameAware
bean生命周期第九步，postProcessAfterInitialization 被调用    arg1:top.chgl16.myspring.beanlife.MyBeanNameAware@2f686d1f


bean生命周期第十步，Hello chgl16
