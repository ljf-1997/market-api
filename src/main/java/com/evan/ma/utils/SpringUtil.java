package com.evan.ma.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @description: 这是一个spring工具类，用来在spring框架中集中管理自定义的bean
 * 在自定义的bean中加入注解@Component("name"), 使用时调用getBean("name")方法即可
 *
 *
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContextParam) throws BeansException {
        applicationContext = applicationContextParam;
    }
    public static Object getObject(String id) {
        Object object = applicationContext.getBean(id);
        return object;
    }
    public static <T> T getObject(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }

    public static Object getBean(String tClass) {
        return applicationContext.getBean(tClass);
    }

    public static <T> T getBean(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }

    public  static <T> T getBean(String name, Class<T> tClass){
        return applicationContext.getBean(name, tClass);
    }
}