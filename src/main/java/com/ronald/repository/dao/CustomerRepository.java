package com.ronald.repository.dao;

import com.ronald.oneToOneUni.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

/*    Customer save(Customer customer);*/
}
