package com.kaikeventura.goodhabits.service;

import java.math.BigDecimal;

import com.kaikeventura.goodhabits.payload.TaxPayload;
import com.kaikeventura.goodhabits.util.Taxes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    
    @Autowired
    private TaxesService taxesService;

    @Test
    public void test() {
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.IOF)));
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.IPI)));
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.FGTS)));
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.INSS)));
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.IPTU)));
    }
}
