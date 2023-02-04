package me.chandankumar.learningspringboot.repository.impl;

import me.chandankumar.learningspringboot.entity.Customer;
import me.chandankumar.learningspringboot.repository.CustomerRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(1L, "Chandan Kumar"),
                new Customer(2L, "Ravi Gupta")
        );
    }
}
