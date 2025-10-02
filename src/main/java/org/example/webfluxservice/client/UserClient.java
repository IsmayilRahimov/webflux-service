package org.example.webfluxservice.client;

import lombok.Data;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Data
public class UserClient {

    private final RestTemplate restTemplate;

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List getAllAircraft() {
        String url = "http://localhost:8080/aircraft";
        return restTemplate.getForObject(url, List.class);
    }

}
