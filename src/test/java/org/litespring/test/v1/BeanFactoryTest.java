package org.litespring.test.v1;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeanFactoryTest {

    @Test
    public void testGetBean() {
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        BeanDefinition beanDefinition = factory.getBeanDefinition("petStore");

        assertEquals("org.litespring.service.v1.PetStoreService",beanDefinition.getBeanClassName());
    }
}