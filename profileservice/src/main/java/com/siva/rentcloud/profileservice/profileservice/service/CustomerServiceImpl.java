package com.siva.rentcloud.profileservice.profileservice.service;

import com.siva.rentacarentity.common.Customer;
import com.siva.rentcloud.profileservice.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
