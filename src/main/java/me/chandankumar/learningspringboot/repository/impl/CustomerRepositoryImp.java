package me.chandankumar.learningspringboot.repository.impl;

import me.chandankumar.learningspringboot.entity.Customer;
import me.chandankumar.learningspringboot.repository.CustomerRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public interface CustomerRepositoryImp extends JpaRepository<Customer, Long>  {


}
