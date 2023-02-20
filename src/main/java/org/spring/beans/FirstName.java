package org.spring.beans;

import org.spring.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */
@Component(value = "firstName")
public class FirstName implements BeanName {
    private String name;

    public FirstName(){
        this.name = "Joozepp";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
