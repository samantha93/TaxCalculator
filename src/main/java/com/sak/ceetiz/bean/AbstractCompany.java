package com.sak.ceetiz.bean;

public abstract class AbstractCompany implements Company {

    private final double capital;

    private final double percentage;

    public AbstractCompany(double capital, double percentage) {
        this.capital = capital;
        this.percentage = percentage;
    }

    @Override
    public double calculateTax() {
        return capital * 100 / percentage;
    }

    public String getCapital() {
        return String.format("%.2f€", capital);
    }

    public String getPercentage() {
        return String.format("%.2f€", percentage);
    }
}
