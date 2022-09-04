package com.project.portal;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    /**
     * The main method of the application.
     *
     * @param args the runtime arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Creates an instance of ModelMapper.
     *
     * @return the ModelMapper
     */
    @Bean
    ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
