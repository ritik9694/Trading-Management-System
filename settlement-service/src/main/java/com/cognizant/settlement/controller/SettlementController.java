package com.cognizant.settlement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.settlement.dto.SettlementDto;
import com.cognizant.settlement.service.SettlementServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/settlement")
public class SettlementController {
	
	@Autowired
	private SettlementServiceImpl serviceImpl;
	
	@PostMapping
	public ResponseEntity<SettlementDto> create(@Valid@RequestBody SettlementDto dto){
		return new ResponseEntity<>(serviceImpl.createSettlement(dto),HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<SettlementDto> getById(@PathVariable Long id){
		return ResponseEntity.ok(serviceImpl.getSettlement(id));
	}
	@GetMapping
	public ResponseEntity<List<SettlementDto>> getAll(){
		return ResponseEntity.ok(serviceImpl.getAllSettlement());
	}
	@PutMapping("/{id}")
	public ResponseEntity<SettlementDto> update(@PathVariable Long id,@Valid@RequestBody SettlementDto dto){
		return ResponseEntity.ok(serviceImpl.updateSettlement(id, dto));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<SettlementDto> delete(@PathVariable Long id){
		serviceImpl.deleteSettlement(id);
		return ResponseEntity.noContent().build();
	}
	
}
