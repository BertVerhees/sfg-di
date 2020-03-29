package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## LifeCycleBean constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // InitializingBean
        System.out.println("## Properties are set");
    }

    @Override
    public void destroy() throws Exception {
        // DisposableBean
        System.out.println("## Bean is terminated");
    }

    @Override
    public void setBeanName(String s) {
        // BeanNameAware
        System.out.println("## My name is: "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // BeanFactoryAware
        System.out.println("## Factory is set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // ApplicationContextAware
        System.out.println("## Application context set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## Post construct");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("## Pre Destroy");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
