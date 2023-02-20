package org.spring;


import org.spring.beans.MyBean;
import org.spring.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Joozepp
 * @Date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.sayHello());

        myBean.setName("Joosep");
        System.out.println(myBean.sayHello());

    }
}


