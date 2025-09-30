package com.cognizant.tradingCompany.controller;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.cognizant.tradingCompany.dto.TradingCompanyRequestDto;
import com.cognizant.tradingCompany.dto.TradingCompanyResponseDto;
import com.cognizant.tradingCompany.service.TradingCompanyServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.http.ResponseEntity;

public class TradingCompanyControllerTest {

    @InjectMocks
    private TradingCompanyController controller;

    @Mock
    private TradingCompanyServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreate() {
        // Arrange
        TradingCompanyRequestDto requestDto = new TradingCompanyRequestDto();
        requestDto.setName("Test Company");

        TradingCompanyResponseDto responseDto = new TradingCompanyResponseDto();
        responseDto.setId(1L);
        responseDto.setName("Test Company");

        when(service.create(requestDto)).thenReturn(responseDto);

        // Act
        ResponseEntity<TradingCompanyResponseDto> response = controller.create(requestDto);

        // Assert
        assertEquals(201, response.getStatusCodeValue());
        assertEquals("Test Company", response.getBody().getName());
    }

    @Test
    void testGetById() {
        TradingCompanyResponseDto responseDto = new TradingCompanyResponseDto();
        responseDto.setId(1L);
        responseDto.setName("Test Company");

        when(service.getById(1L)).thenReturn(responseDto);

        ResponseEntity<TradingCompanyResponseDto> response = controller.getById(1L);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Test Company", response.getBody().getName());
    }

   
}
