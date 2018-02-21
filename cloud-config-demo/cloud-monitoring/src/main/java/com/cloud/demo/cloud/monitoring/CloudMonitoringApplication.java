package com.cloud.demo.cloud.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
@EnableHystrixDashboard
public class CloudMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudMonitoringApplication.class, args);
	}
}
