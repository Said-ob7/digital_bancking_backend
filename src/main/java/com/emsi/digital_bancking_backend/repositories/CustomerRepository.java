package com.emsi.digital_bancking_backend.repositories;

import com.emsi.digital_bancking_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
