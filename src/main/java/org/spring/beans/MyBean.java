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
@Component
public class MyBean {
    private BeanName name;

    public MyBean(@Qualifier("firstBookName") BeanName name) {
        this.name = name;
    }

    public String sayBook() {
        return "You are reading: " + name.getName();
    }
}
