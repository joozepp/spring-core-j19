package org.spring.beans;

import lombok.Setter;
import org.spring.interfaces.BeanName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */
@Setter
@Component(value="myBean")
public class MyBean {
    private BeanName name;

    public MyBean(@Qualifier("firstName") BeanName name){       //qualifier
        this.name = name;
    }
    public String sayHello(){
        return "Hello " + name.getName() + "!";   //interface has a method getName
    }
}
