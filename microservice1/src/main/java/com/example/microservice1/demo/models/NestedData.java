package com.example.microservice1.demo.models;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NestedData {
    private String details;
    private String description;
}
