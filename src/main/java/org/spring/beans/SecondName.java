package org.spring.beans;

import org.spring.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */
@Component(value = "secondName")
public class SecondName implements BeanName {
    private String name;
    public SecondName() {
        this.name = "Joosep";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
