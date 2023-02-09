package br.com.bank;

import java.math.BigDecimal;

public class MethodPaymentImpl {

    public BigDecimal calcule(Product payValue, PayStrategyEnum strategy) {
            return strategy.calcule(payValue);
    }
}
