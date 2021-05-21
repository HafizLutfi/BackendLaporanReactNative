package com.juaracoding.backendmobilelaporan.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.juaracoding.backendmobilelaporan.entity.Laporan;
import com.juaracoding.backendmobilelaporan.entity.User;

public interface LaporanRespository extends CrudRepository<Laporan, Long>{

	@Query(value ="SELECT * FROM laporan WHERE username= ?1",nativeQuery = true)
	List<Laporan> findAllByUsername(String username);

}
