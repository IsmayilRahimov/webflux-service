package org.example.webfluxservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Aircraft {

    private final Long id;
    private final String name;
    private final int age;
    private final String country;

}
