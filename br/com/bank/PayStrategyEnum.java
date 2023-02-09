package br.com.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum PayStrategyEnum {
    CREDITCARD {
        @Override
        public BigDecimal calcule(Product pay) {
            return pay.getValue().multiply(new BigDecimal("1.08"))
                    .setScale(2, RoundingMode.DOWN);
        }
    }, DEBITCART {
        @Override
        public BigDecimal calcule(Product pay) {
            return pay.getValue().multiply(new BigDecimal("1.05"))
                    .setScale(2, RoundingMode.DOWN);
        }
    }, MILES {
        @Override
        public BigDecimal calcule(Product pay) {
            return pay.getValue().subtract(pay.getValue().multiply(new BigDecimal("0.08")))
                    .setScale(2, RoundingMode.DOWN);
        }
    }, PIX {
        @Override
        public BigDecimal calcule(Product pay) {
            return pay.getValue().subtract(pay.getValue().multiply(new BigDecimal("0.30")))
                    .setScale(2, RoundingMode.DOWN);
        }
    };

    public abstract BigDecimal calcule(Product pay);
}
