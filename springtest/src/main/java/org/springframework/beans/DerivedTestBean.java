package org.springframework.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DerivedTestBean implements BeanPostProcessor{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void initialize() {
		System.out.println("--------DerivedTestBean initialize");
	}
	
	// simply return the instantiated bean as-is
    public Object postProcessBeforeInitialization(Object bean,
            String beanName) throws BeansException {
    	System.out.println("-------------before initialize");
        return bean; // we could potentially return any object reference here...
    }

    public Object postProcessAfterInitialization(Object bean,
            String beanName) throws BeansException {
        System.out.println("Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}
