package com.example.sb.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Profile("DEV")
public class DevService {
    @Scheduled(fixedDelay = 1000)
    public void task() {
        System.out.println("Dev...........");
    }

}
