package com.cloud.demo.cloudeconfig.server;

import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile("config-monitor")
@Configuration
@Import(RabbitAutoConfiguration.class)
public class MonitorConfiguration {
}
