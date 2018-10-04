package org.springframework.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class PostProcessorB implements BeanPostProcessor,Ordered {

    public Object postProcessBeforeInitialization(Object bean,
            String beanName) throws BeansException {
        System.out.println("!!!后置处理器开始调用了");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,
            String beanName) throws BeansException {
        System.out.println("!!!后置处理器调用结束了");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bean;
    }

    public int getOrder() {
		return 0;
	}
}
