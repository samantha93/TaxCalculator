package com.sak.ceetiz.bean;


import org.junit.jupiter.api.Test;

class AbstractCompanyTest {

    @Test
    public void testCalculateTax_NegativeCapital_ShouldThrowException() {
        SAS sas = new SAS(-1, "Siret number", "name", "address");
        sas.calculateTax();
    }
}