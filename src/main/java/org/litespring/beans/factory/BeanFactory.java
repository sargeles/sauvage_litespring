package org.litespring.beans.factory;

import org.litespring.beans.BeanDefinition;

/**
 * @author sargeles
 */
public interface BeanFactory {
    Object getBean(String beanId);
}
