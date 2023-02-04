package me.chandankumar.learningspringboot.config;

import me.chandankumar.learningspringboot.repository.CustomerRepository;
import me.chandankumar.learningspringboot.repository.impl.CustomerFakeRepositoryImpl;
import me.chandankumar.learningspringboot.repository.impl.CustomerRepositoryImp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Value("${app.isFakeCustomerRepositoryEnabled:false}")
    private Boolean isFakeCustomerRepositoryEnabled;

    @Bean
    CustomerRepository customerRepository(){
        if(isFakeCustomerRepositoryEnabled){
            return new CustomerFakeRepositoryImpl();
        }
        return new CustomerRepositoryImp();
    }


}
