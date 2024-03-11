package com.ne0gi02.learner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean("myBean")
    @Qualifier("Bean1")
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("my first Bean");
    }

    @Bean
    @Qualifier("Bean2")
    public MyFirstClass mysecondBean() {
        return new MyFirstClass("my second Bean");
    }

    @Bean
    @Primary // this will be the default bean to be injected
    public MyFirstClass mythirdBean() {
        return new MyFirstClass("my third Bean");
    }

}
