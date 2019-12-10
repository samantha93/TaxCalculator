package com.sak.ceetiz.bean;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class AbstractCompanyTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testCalculateTax_NegativeCapital_ShouldThrowException() {
        expectedException.expect(IllegalArgumentException.class);
        Company sas = new NegativeValueCompany(-1, 120);
        sas.calculateTax();
    }

    @Test
    public void testCalculateTax_NegativePercentage_ShouldThrowException() {
        expectedException.expect(IllegalArgumentException.class);
        Company sas = new NegativeValueCompany(1000, -10);
        sas.calculateTax();
    }

    public static class NegativeValueCompany extends AbstractCompany {

        public NegativeValueCompany(double capital, double percentage) {
            super(capital, percentage);
        }
    }
}