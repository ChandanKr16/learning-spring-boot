package me.chandankumar.learningspringboot.repository;

import me.chandankumar.learningspringboot.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getCustomers();

}
