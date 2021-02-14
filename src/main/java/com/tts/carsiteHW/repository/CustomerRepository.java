package com.tts.carsiteHW.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.carsiteHW.domain.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}

    
    
    
    
    
    
    
//public interface CustomerRepository {
//
//}
