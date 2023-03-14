package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface EmployerRepository extends CrudRepository<Job, Integer> {

}
