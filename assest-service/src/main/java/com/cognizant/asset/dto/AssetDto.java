package com.cognizant.asset.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssetDto {

   
	private Long id;
	
	@NotBlank(message = "Name is required")
	@Size(min = 2, max =150,message = "Name Must be between 2 and 150 characters")
	private String name;
	
	@NotBlank(message = "symbol is required ")
	@Size(max = 20, message = "Symbol not exceed 20 characters")
	private String symbol;
	
	@NotBlank(message = "Type is required (eg .., STOCK, BOND)")
	private String type;
	
	@DecimalMin(value = "0.01",message = "Current price must be greater than 0")
	private BigDecimal currentPrice;
	
	@NotBlank(message = "ListedSince date ")
	private LocalDate listedSince;
}
