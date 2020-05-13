package com.davidevanoni.msscbrewery.web.service;

import com.davidevanoni.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
