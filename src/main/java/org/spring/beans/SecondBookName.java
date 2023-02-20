package org.spring.beans;

import org.spring.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */
@Component(value = "SecondBookName")
public class SecondBookName implements BeanName {
    private String bookName;
    public SecondBookName(){
        this.bookName = "The law of Attraction";
    }


    @Override
    public String getName() {
        return this.bookName;
    }
}
