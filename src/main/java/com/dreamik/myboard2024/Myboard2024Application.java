package com.dreamik.myboard2024;

import com.dreamik.myboard2024.connectionTest.TestDataInit;
import com.dreamik.myboard2024.repository.ExampleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Myboard2024Application {

    public static void main(String[] args) {
        SpringApplication.run(Myboard2024Application.class, args);
    }
    @Bean
    @Profile("local")
    public TestDataInit testDataInit(ExampleRepository exampleRepository) {
        return new TestDataInit(exampleRepository);
    }

}
