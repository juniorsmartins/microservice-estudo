package io.udemyapirestjava.config.bean;

import com.github.javafaker.Faker;
import io.udemyapirestjava.adapters.out.PersonFindAllAdapter;
import io.udemyapirestjava.adapters.out.PersonFindByIdAdapter;
import io.udemyapirestjava.application.core.usecase.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public PersonFindByIdFindByIdUseCase personFindByIdFindByIdUseCase(PersonFindByIdAdapter personFindByIdAdapter) {
        return new PersonFindByIdFindByIdUseCase(personFindByIdAdapter);
    }

    @Bean
    public PersonFindAllUseCase personFindAllUseCase(PersonFindAllAdapter personFindAllAdapter) {
        return new PersonFindAllUseCase(personFindAllAdapter);
    }

    @Bean
    public PersonCreateUseCase personCreateUseCase() {
        return new PersonCreateUseCase();
    }

    @Bean
    public PersonUpdateUseCase personUpdateUseCase() {
        return new PersonUpdateUseCase();
    }

    @Bean
    public PersonDeleteUseCase personDeleteUseCase() {
        return new PersonDeleteUseCase();
    }
}

