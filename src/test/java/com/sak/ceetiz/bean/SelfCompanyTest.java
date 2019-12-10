package com.sak.ceetiz.bean;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SelfCompanyTest {

    @Test
    public void testCalculateTax_PositiveCapitalForSelfCompany_ShouldReturnTax() {
        Company selfCompany = new SelfCompany(150, "Siret number", "self company");
        double actual = selfCompany.calculateTax();
        assertEquals(37.5, actual);
    }
}