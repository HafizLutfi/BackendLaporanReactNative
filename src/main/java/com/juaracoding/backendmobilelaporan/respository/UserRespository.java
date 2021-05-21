package com.juaracoding.backendmobilelaporan.respository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.juaracoding.backendmobilelaporan.entity.User;

public interface UserRespository extends CrudRepository<User, Long> {

	@Query(value="select * from user where username= ?1",nativeQuery = true)
	List<User> findAllByUsername(String username);



}
