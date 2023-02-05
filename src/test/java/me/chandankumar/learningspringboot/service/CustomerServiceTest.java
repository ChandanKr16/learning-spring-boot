package me.chandankumar.learningspringboot.service;

import me.chandankumar.learningspringboot.entity.Customer;
import me.chandankumar.learningspringboot.repository.impl.CustomerRepositoryImp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    @Autowired
    private CustomerRepositoryImp customerRepositoryImp;
    private CustomerService underTest;

    @BeforeEach
    void setUp() {

        underTest = new CustomerService(customerRepositoryImp);

    }

    @AfterEach
    void tearDown() {
        customerRepositoryImp.deleteAll();
    }

    @Test
    void getCustomers() {

        Customer customer = new Customer(
                1L,
                "Chandan",
                "Hello",
                "ckp@gmail.com"
        );

        customerRepositoryImp.save(customer);

        List<Customer> customerList = underTest.getCustomers();

        assertEquals(1, customerList.size());

    }
}