package com.example.microservice1.demo.repositories;

import com.example.microservice1.demo.models.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DataRepository extends CrudRepository<Data, UUID> {
    @Override
    List<Data> findAll();
}
