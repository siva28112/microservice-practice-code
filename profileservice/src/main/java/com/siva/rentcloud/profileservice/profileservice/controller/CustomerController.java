package com.siva.rentcloud.profileservice.profileservice.controller;

import com.siva.rentacarentity.common.Customer;
import com.siva.rentcloud.profileservice.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/profile")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }
}
