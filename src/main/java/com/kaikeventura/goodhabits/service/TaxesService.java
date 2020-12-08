package com.kaikeventura.goodhabits.service;

import java.math.BigDecimal;

import com.kaikeventura.goodhabits.payload.TaxPayload;

import org.springframework.stereotype.Service;

@Service
public class TaxesService {

    public BigDecimal calculateTax(final TaxPayload taxPayload) {
        return taxPayload.getTaxes().calculateTaxe(taxPayload.getValue());
    }
    
}
