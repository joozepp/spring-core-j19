package org.spring;


import org.spring.beans.MyBean;
import org.spring.beans.SecondBookName;
import org.spring.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author Joozepp
 * @Date ${DATE}
 */

                                              //  -----------------------------SPRING VERSION 5.3.25 REQUIRED FOR AUTO-CONFIG---------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.sayBook());

        myBean.setName(new SecondBookName());
        System.out.println(myBean.sayBook());
    }
}


