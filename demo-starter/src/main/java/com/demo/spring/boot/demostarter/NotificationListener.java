package com.demo.spring.boot.demostarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class NotificationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private NotificationProperties properties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        properties.getMails().forEach(System.out::println);
    }
}
