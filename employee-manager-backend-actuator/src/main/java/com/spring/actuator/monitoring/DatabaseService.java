package com.spring.actuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {
    private final String DATABASE_SERVICE = "DatabaseService";

//    @Override
//    public Health getHealth(boolean includeDetails) {
//        return null;
//    }

    @Override
    public Health health() {
        if(isDatabaseHealthGood()) {
            return Health.up().withDetail(DATABASE_SERVICE, "Database Service is Running").build();
        } else {
            return Health.down().withDetail(DATABASE_SERVICE, "Database Service is not available").build();
        }
    }

    private boolean isDatabaseHealthGood() {
        return true;
    }
}
