package com.cloud.demo.cloudconfigclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Task {
    @Autowired
    AppConfig appConfig;

    @Scheduled(fixedDelay = 2000)
    public void task() {
        System.out.println(appConfig.getText());
    }

}
