package com.example.long_running_api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.long_running_api.model.CustomerModel;
import com.example.long_running_api.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Page<CustomerModel> getCustomers(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
