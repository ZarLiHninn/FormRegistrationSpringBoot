package com.demo.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@org.springframework.context.annotation.Configuration
public class Configuration extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
    @Bean
    @Qualifier("subjects")
    public List < String > subjects() {
        return Arrays.asList("Burmese", "English", "Maths", "Chemistry", "Physics", "Biology");
    }
    @Bean
    @Qualifier("days")
    public List < String > days() {
        return Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");
    }
    @Bean
    @Qualifier("months")
    public List < String > months() {
        return Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
    }
    @Bean
    @Qualifier("years")
    public List < String > years() {
        return Arrays.asList("1998", "1999", "2000", "2001", "2002", "2003");
    }
 }