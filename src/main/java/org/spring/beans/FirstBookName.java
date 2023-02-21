package org.spring.beans;

import org.spring.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */
@Component(value = "firstBookName")
public class FirstBookName implements BeanName {
    private String bookName;

    public FirstBookName(){
        this.bookName = "Doors of Perception";
    }

    @Override
    public String getName() {
        return this.bookName;
    }
}
