package com.demo.spring.boot.demostarter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class ProfileStopperApplicationInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        if(configurableApplicationContext.getEnvironment().getActiveProfiles().length == 0) {
            throw new IllegalStateException("no profile");
        }
    }
}
