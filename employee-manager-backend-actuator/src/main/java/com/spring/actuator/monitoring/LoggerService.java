package com.spring.actuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {
    private final String LOGGER_SERVICE = "DatabaseService";

//    @Override
//    public Health getHealth(boolean includeDetails) {
//        return null;
//    }

    @Override
    public Health health() {
        if(isLoggerServiceGood()) {
            return Health.up().withDetail(LOGGER_SERVICE, "Logger Service is Running").build();
        } else {
            return Health.down().withDetail(LOGGER_SERVICE, "Logger Service is not available").build();
        }
    }

    private boolean isLoggerServiceGood() {
        return false;
    }
}
