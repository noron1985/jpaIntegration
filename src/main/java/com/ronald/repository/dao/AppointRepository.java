package com.ronald.repository.dao;

import com.ronald.many.to.many.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointRepository extends CrudRepository<Appointment, Long> {

    //si pas de methode présente dans CrudRepos la rajouter ici
}
