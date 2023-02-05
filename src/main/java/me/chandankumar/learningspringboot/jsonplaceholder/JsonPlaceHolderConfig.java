package me.chandankumar.learningspringboot.jsonplaceholder;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonPlaceHolderConfig {

    @Bean("jsonplaceholder")
    CommandLineRunner commandLineRunner(JsonPlaceHolderClient
                                                jsonPlaceHolderClient){
        return args -> {
            System.out.println();
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println();
            System.out.println(jsonPlaceHolderClient.getPost(1));
        };
    }

}
