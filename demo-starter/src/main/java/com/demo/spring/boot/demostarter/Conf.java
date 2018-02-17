package com.demo.spring.boot.demostarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(NotificationProperties.class)
public class Conf {
    @Bean
    @Profile("PROD")
    @ConditionalOnMissingBean(name = "notificationListener")
    @ConditionalOnProperty(name = "prop.notify", matchIfMissing = true, havingValue = "true")
    public NotificationListener listener() {
        return new NotificationListener();
    }
}
