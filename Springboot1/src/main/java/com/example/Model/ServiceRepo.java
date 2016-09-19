package com.example.Model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends CrudRepository<Service, String>{
	public static final String Find_Services="SELECT u.service FROM Service u";
	@Query(Find_Services)
	public List<String> findAllServices();

}
