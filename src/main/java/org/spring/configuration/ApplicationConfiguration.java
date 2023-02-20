package org.spring.configuration;

import org.spring.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Joozepp
 * @Date 2/20/2023
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setName("Joozepp");
        return myBean;
    }
}
