package com.ronald.repository.dao;

import com.ronald.manyToOneUni.Ship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends CrudRepository<Ship, Long> {
}
