package com.example.microservice1.demo;

import com.example.microservice1.demo.models.Data;
import com.example.microservice1.demo.models.NestedData;
import com.example.microservice1.demo.repositories.DataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private DataRepository dataRepository;

	@PostConstruct
	public void test() {
		dataRepository.saveAll(Arrays.asList(
				Data.builder().id(UUID.randomUUID()).details(NestedData.builder().details("Hello").description("Hello Hello").build()).build(),
				Data.builder().id(UUID.randomUUID()).details(NestedData.builder().details("Hello").description("Hello Hello").build()).build(),
				Data.builder().id(UUID.randomUUID()).details(NestedData.builder().details("Hello").description("Hello Hello").build()).build(),
				Data.builder().id(UUID.randomUUID()).details(NestedData.builder().details("Hello").description("Hello Hello").build()).build(),
				Data.builder().id(UUID.randomUUID()).details(NestedData.builder().details("Hello").description("Hello Hello").build()).build(),
				Data.builder().id(UUID.randomUUID()).details(NestedData.builder().details("Hello").description("Hello Hello").build()).build(),
				Data.builder().id(UUID.randomUUID()).details(NestedData.builder().details("Hello").description("Hello Hello").build()).build(),
				Data.builder().id(UUID.randomUUID()).details(NestedData.builder().details("Hello").description("Hello Hello").build()).build()
		));
		final List<Data> all = dataRepository.findAll();
		log.info("Size of list: {}", all.size());
	}

}
