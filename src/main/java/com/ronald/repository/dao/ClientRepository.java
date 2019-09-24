package com.ronald.repository.dao;

import com.ronald.oneToOneBi.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// clientRepo ou clientDao identique repo est plus generique
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
