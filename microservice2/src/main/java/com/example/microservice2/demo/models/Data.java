package com.example.microservice2.demo.models;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.util.UUID;

@Builder
@RedisHash("DATA:DATASET")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Data {
    private UUID id;
    private NestedData details; // NestedEvent : Object with nested Objects
}
