package br.com.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MethodPayment {
    public static void main(String[] args) {
        Product pay = new Product(new BigDecimal("50.000"));
        System.out.println("Valor do produto: "+pay.getValue().setScale(2, RoundingMode.DOWN));
        MethodPaymentImpl payment = new MethodPaymentImpl();
        System.out.println("O pagamento final no Cartão de crédito: "+payment.calcule(pay, PayStrategyEnum.CREDITCARD));
        System.out.println("O pagamento final no Cartão de débito: "+payment.calcule(pay, PayStrategyEnum.DEBITCART));
        System.out.println("O pagamento final com Milhas: "+payment.calcule(pay, PayStrategyEnum.MILES));
        System.out.println("O pagamento final com PIX: "+payment.calcule(pay, PayStrategyEnum.PIX));
    }
}