package org.example.webfluxservice.client;

import lombok.Data;
import org.example.webfluxservice.model.Aircraft;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Component
@Data
public class UserClient {

    private final RestTemplate restTemplate;

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List getAllAircraft() {
        String url = "http://localhost:8080/aircraft";
        Aircraft[] response = restTemplate.getForObject(url, Aircraft[].class);
        return Arrays.asList(response);
    }

}
