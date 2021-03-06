package com.cloud.demo.cloudconfigclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Integration {
    @HystrixCommand(
            fallbackMethod = "defaultMethod",
            commandProperties = {
                    @HystrixProperty(
                            name = "circuitBreaker.errorThresholdPercentage", value = "25"
                    ),
                    @HystrixProperty(
                            name = "circuitBreaker.sleepWindowInMilliseconds", value = "1000"
                    )
            }
    )
    public String getParam(String param) {
        if(param.equals("wtf")) throw new IllegalStateException("WTF");

        param = param + " Message value";
        System.out.println(param);

        return param;
    }

    public String defaultMethod(String param) {
        param = param + " ERROR value";
        System.out.println(param);
        return param;
    }
}
