package com.sak.ceetiz.bean;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;

public class SASCompanyTest {

    private static final String SIRET_NUMBER = "Siret number";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testCalculateTax_PositiveCapitalForSasCompany_ShouldReturnTax() {
        Company sas = new SAS(150, "Siret number", "name", "address");
        double actual = sas.calculateTax();
        assertEquals(49.5, actual);
    }

    @Test
    public void two_sas_with_same_siret_should_be_equal() {
        AbstractCompany sas = new SAS(150, SIRET_NUMBER, "name 1", "address 1");
        AbstractCompany sas2 = new SAS(333, SIRET_NUMBER, "name 2", "address 2");

        assertEquals(sas, sas2);
    }

    @Test
    public void create_a_sas_with_null_siret_is_forbidden() {
        expectedException.expect(IllegalArgumentException.class);
        AbstractCompany sas = new SAS(150, null, "name 1", "address 1");
    }
}
