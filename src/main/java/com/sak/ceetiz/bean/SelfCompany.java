package com.sak.ceetiz.bean;

public class SelfCompany extends AbstractCompany {

    private static final double SELF_COMPANY_PERCENTAGE = 25;

    public SelfCompany(double capital, String siret, String name) {
        super(siret, name, capital, SELF_COMPANY_PERCENTAGE);
    }

    @Override
    public String toString() {
        return "SelfCompany{" +
                "siret='" + getSiret() + '\'' +
                ", name='" + getName() + '\'' +
                ", capital='" + getCapital() + '\'' +
                '}';
    }
}
