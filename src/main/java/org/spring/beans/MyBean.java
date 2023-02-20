package org.spring.beans;

import lombok.Setter;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */
@Setter
public class MyBean {
    private String name;

    public String sayHello(){
        return "Hello " + name +"!";
    }
}
