package com.ronald.repository.dao;

import com.ronald.oneToManyBi.Cruise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CruiseRepository extends CrudRepository<Cruise, Long> {
}
