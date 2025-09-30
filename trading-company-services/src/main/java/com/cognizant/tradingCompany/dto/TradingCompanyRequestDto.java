package com.cognizant.tradingCompany.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TradingCompanyRequestDto {

	@NotBlank(message = "Name Cannot be blank")
	@Size(min = 3,max = 150,message = "Name must be between 3 and 150 Characters")
	private String name;

	@NotBlank(message = "License Number is required")
	private String licenseNumber;

	@Email(message = "Invalid Email formate")
	private String contactEmail;

	@NotBlank(message = "Address is Required")
	private String address;
}
