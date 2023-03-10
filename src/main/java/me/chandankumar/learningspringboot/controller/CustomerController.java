package me.chandankumar.learningspringboot.controller;

import me.chandankumar.learningspringboot.entity.Customer;
import me.chandankumar.learningspringboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/customer")
@RestController
@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer){
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
