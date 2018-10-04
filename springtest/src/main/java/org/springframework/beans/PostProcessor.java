package org.springframework.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class PostProcessor implements BeanPostProcessor,Ordered{
	
		
    public Object postProcessBeforeInitialization(Object bean,
            String beanName) throws BeansException {
        System.out.println("~~~~后置处理器处理bean=【"+beanName+"】开始");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,
            String beanName) throws BeansException {
        System.out.println("~~~~后置处理器处理bean=【"+beanName+"】完毕!");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bean;
    }

    public int getOrder() {
        return 1;
    }
}
