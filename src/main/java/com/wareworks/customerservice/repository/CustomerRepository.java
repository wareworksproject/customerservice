package com.wareworks.customerservice.repository;

import com.wareworks.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { 
}