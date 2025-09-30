package com.cognizant.settlement.dto;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettlementDto {

	private Long id;
	
	@NotNull(message = "Trade Order Id is required")
	private Long tradeOrderId;
	
	@NotNull(message = "Settlement Date is required")
	private String settlementDate;
	
	@DecimalMin(value = "0.01",message = "Amount Must be greater than 0")
	private BigDecimal amount;
	
	@NotBlank(message = "Status is Required")
	private String status;
	
	@NotBlank(message = "Payment refernce is required")
	private String paymentReference;	
	
}
