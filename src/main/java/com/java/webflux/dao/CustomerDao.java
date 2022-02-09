package com.java.webflux.dao;

import com.java.webflux.dto.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CustomerDao {
  public List<Customer> getCustomers() {
    return IntStream.rangeClosed(1, 50)
            .peek(i -> System.out.println("contando el proceso: " + i))
            .mapToObj(i -> new Customer(i, "customer" + 1))
            .collect(Collectors.toList());
  }
}
