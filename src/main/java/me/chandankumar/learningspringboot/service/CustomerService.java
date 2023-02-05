package me.chandankumar.learningspringboot.service;

import lombok.AllArgsConstructor;
import me.chandankumar.learningspringboot.entity.Customer;
import me.chandankumar.learningspringboot.repository.CustomerRepository;
import me.chandankumar.learningspringboot.repository.impl.CustomerRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepositoryImp customerRepository;

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }
}
