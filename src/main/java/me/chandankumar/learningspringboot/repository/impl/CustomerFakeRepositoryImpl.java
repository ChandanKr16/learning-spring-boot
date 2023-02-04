package me.chandankumar.learningspringboot.repository.impl;

import me.chandankumar.learningspringboot.entity.Customer;
import me.chandankumar.learningspringboot.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerFakeRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(1L, "Chandan Kumar", "password", "email@gmail.com"),
                new Customer(2L, "Ravi Gupta", "12345678", "email@gmail.com")
        );
    }
}
