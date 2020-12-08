package com.kaikeventura.goodhabits.payload;

import java.math.BigDecimal;

import com.kaikeventura.goodhabits.util.Taxes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaxPayload {
    private BigDecimal value;
    private Taxes taxes;
}
