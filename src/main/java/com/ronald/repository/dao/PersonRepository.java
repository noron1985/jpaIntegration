package com.ronald.repository.dao;

import com.ronald.many.to.many.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
