package org.litespring.beans.factory.support;

/**
 * @author sargeles
 */
public interface SingletonBeanRegistry {

    void registerSingleton(String beanName, Object singletonObject);

    Object getSingleton(String beanName);
}