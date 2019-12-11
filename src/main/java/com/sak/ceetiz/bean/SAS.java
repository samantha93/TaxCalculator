package com.sak.ceetiz.bean;

public class SAS extends AbstractCompany {

    private static final double SAS_PERCENTAGE = 33;

    private final String address;

    public SAS(double capital, String siret, String name, String address) {
        super(siret, name, capital, SAS_PERCENTAGE);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "SAS{" +
                "siret='" + getSiret() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + address + '\'' +
                ", capital='" + getCapital() + '\'' +
                '}';
    }
}
