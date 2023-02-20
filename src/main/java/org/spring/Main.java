package org.spring;


import org.spring.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author Joozepp
 * @Date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.sayHello());

        myBean.setName("Joosep");
        System.out.println(myBean.sayHello());
    }
}


