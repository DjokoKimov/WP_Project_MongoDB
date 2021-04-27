package com.wpproject.springbootmongodb.config;

import com.wpproject.springbootmongodb.document.User;
import com.wpproject.springbootmongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongodbConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User(1,"Djoko", "Kimov",15000L));
            userRepository.save(new User(2,"Tashko", "Pavlov",20000L));
        };
    }
}
