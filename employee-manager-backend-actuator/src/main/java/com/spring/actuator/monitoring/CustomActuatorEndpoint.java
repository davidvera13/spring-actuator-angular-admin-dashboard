package com.spring.actuator.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "custom")
public class CustomActuatorEndpoint {

    @ReadOperation
    public Map<String, String> customEnpoint(String username) {
        Map<String, String> map = new HashMap<>();
        map.put("Key", "value");
        map.put("username", username);
        return map;
    }
}
