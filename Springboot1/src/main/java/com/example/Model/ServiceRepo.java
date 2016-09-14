package com.example.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends CrudRepository<Service,String>{

}
