package com.sak.ceetiz.bean;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SASCompanyTest {

    @Test
    public void testCalculateTax_PositiveCapitalForSasCompany_ShouldReturnTax() {
        Company sas = new SAS(150, "Siret number", "name", "address");
        double actual = sas.calculateTax();
        assertEquals(49.5, actual);
    }
}
