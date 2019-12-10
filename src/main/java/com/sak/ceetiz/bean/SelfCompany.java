package com.sak.ceetiz.bean;

import java.util.Currency;

public class SelfCompany extends AbstractCompany {

    private static final double SELF_COMPANY_PERCENTAGE = 25;

    private final String siret;

    private final String name;

    public SelfCompany(double capital, String siret, String name) {
        super(capital, SELF_COMPANY_PERCENTAGE);
        this.siret = siret;
        this.name = name;
    }

    public String getSiret() {
        return siret;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SelfCompany{" +
                "siret='" + siret + '\'' +
                ", name='" + name + '\'' +
                ", capital='" + getCapital() + '\'' +
                '}';
    }
}
