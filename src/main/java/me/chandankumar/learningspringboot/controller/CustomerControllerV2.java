package me.chandankumar.learningspringboot.controller;

import jakarta.validation.Valid;
import me.chandankumar.learningspringboot.entity.Customer;
import me.chandankumar.learningspringboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public List<Customer> getCustomers(){
        return Arrays.asList(new Customer(0L, "Version 2 Customer", "Password", "email@gmail.com"));
    }

    @PostMapping
    public void createCustomer(@Valid @RequestBody Customer customer){
        System.out.println(customer);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId){
        System.out.println("Customer with id: "+ customerId + " deleted");
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){
        System.out.println(customer);
    }

}
