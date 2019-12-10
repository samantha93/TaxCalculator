package com.sak.ceetiz.bean;

public class SAS extends AbstractCompany {

    private static final double SAS_PERCENTAGE = 25;

    private final String siret;

    private final String name;

    private final String address;

    public SAS(double capital, String siret, String name, String address) {
        super(capital, SAS_PERCENTAGE);
        this.siret = siret;
        this.name = name;
        this.address = address;
    }

    public String getSiret() {
        return siret;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "SAS{" +
                "siret='" + siret + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capital='" + getCapital() + '\'' +
                '}';
    }
}
