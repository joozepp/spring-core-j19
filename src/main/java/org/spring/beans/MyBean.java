package org.spring.beans;

import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */

@Setter
@Service("myBean")
public class MyBean {
    private String name;

    public String sayHello(){
        return "Hello " + name +"!";
    }
}
