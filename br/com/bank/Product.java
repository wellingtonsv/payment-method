package br.com.bank;

import java.math.BigDecimal;

public class Product {
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Product(BigDecimal value) {
        this.value = value;
    }
}