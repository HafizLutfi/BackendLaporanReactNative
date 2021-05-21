package com.juaracoding.backendmobilelaporan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.backendmobilelaporan.entity.Laporan;
import com.juaracoding.backendmobilelaporan.respository.LaporanRespository;

@RestController
@RequestMapping("/laporan")
public class LaporanController {

	
	@Autowired
	LaporanRespository laporanRepo;
	
	
	@GetMapping("/")
	public List<Laporan> getAll(){
		return (List<Laporan>) laporanRepo.findAll();		
	}
	
	@PostMapping("/add/")
	public String addLaporan(@RequestBody Laporan laporan) {
		laporanRepo.save(laporan);
		return"Laporan Anda berhasil disimpan";
	}
}
