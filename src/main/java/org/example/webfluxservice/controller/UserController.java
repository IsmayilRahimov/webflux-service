package org.example.webfluxservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.webfluxservice.model.Aircraft;
import org.example.webfluxservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {
    private final UserService userService;


    @GetMapping("/getAll")
    public List<Aircraft> getAllAircraft() {
        return userService.getAllAircraft();
    }

}
