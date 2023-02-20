package org.spring;


import org.spring.beans.MyBean;
import org.spring.beans.SecondName;
import org.spring.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        System.out.println(applicationContext.containsBean("myBean"));
        System.out.println(applicationContext.containsBean("firstName"));

        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.sayHello());

        myBean.setName(new SecondName());
        System.out.println(myBean.sayHello());
    }
}


