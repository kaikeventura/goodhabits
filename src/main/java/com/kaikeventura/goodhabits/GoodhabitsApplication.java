package com.kaikeventura.goodhabits;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;

import com.kaikeventura.goodhabits.payload.TaxPayload;
import com.kaikeventura.goodhabits.service.TaxesService;
import com.kaikeventura.goodhabits.util.Taxes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class GoodhabitsApplication {

	private final TaxesService taxesService;

	public static void main(String[] args) {
		SpringApplication.run(GoodhabitsApplication.class, args);
	}

	@PostConstruct
	public void run() {
		System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.IOF)));
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.IPI)));
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.FGTS)));
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.INSS)));
        System.out.println(taxesService.calculateTax(new TaxPayload(BigDecimal.valueOf(10), Taxes.IPTU)));
	}

}
