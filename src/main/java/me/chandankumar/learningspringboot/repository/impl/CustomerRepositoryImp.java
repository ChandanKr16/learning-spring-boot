package me.chandankumar.learningspringboot.repository.impl;

import me.chandankumar.learningspringboot.entity.Customer;
import me.chandankumar.learningspringboot.repository.CustomerRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepositoryImp implements CustomerRepository {
    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
    }
}
