package com.kaikeventura.goodhabits.util;

import java.math.BigDecimal;

public enum Taxes {
    IOF {
        @Override
        public BigDecimal calculateTaxe(BigDecimal value) {
            return value.add(calculatePercentage(BigDecimal.valueOf(5), value));
        }
    },
    IPI {
        @Override
        public BigDecimal calculateTaxe(BigDecimal value) {
            return value.add(calculatePercentage(BigDecimal.valueOf(10), value));
        }
    },
    FGTS {
        @Override
        public BigDecimal calculateTaxe(BigDecimal value) {
            return value.add(calculatePercentage(BigDecimal.valueOf(15), value));
        }
    },
    INSS {
        @Override
        public BigDecimal calculateTaxe(BigDecimal value) {
            return value.add(calculatePercentage(BigDecimal.valueOf(20), value));
        }
    },
    IPTU {
        @Override
        public BigDecimal calculateTaxe(BigDecimal value) {
            return value.add(calculatePercentage(BigDecimal.valueOf(25), value));
        }
    };
    
    public abstract BigDecimal calculateTaxe(final BigDecimal value);

    private static BigDecimal calculatePercentage(final BigDecimal percentage, final BigDecimal value) {
        return value.multiply(percentage).divide(BigDecimal.valueOf(100));
    }

}
