package org.example.webfluxservice.service;


import lombok.RequiredArgsConstructor;
import org.example.webfluxservice.client.UserClient;
import org.example.webfluxservice.model.Aircraft;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserClient userClient;

    @Override
    public List<Aircraft> getAllAircraft() {
        return userClient.getAllAircraft();
    }


}
