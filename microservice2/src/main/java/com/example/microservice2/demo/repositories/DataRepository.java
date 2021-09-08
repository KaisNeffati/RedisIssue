package com.example.microservice2.demo.repositories;

import com.example.microservice2.demo.models.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DataRepository extends CrudRepository<Data, UUID> {
    @Override
    List<Data> findAll();
}
