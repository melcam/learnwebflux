package com.java.webflux.service;

import com.java.webflux.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
  
  @Autowired
  private CustomerDao customerDao;
}
