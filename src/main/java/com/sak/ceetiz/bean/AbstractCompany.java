package com.sak.ceetiz.bean;

public abstract class AbstractCompany implements Company {

    private final double capital;

    private final double percentage;

    public AbstractCompany(double capital, double percentage) {
        if (capital < 0 || percentage < 0) {
            throw new IllegalArgumentException("capital and percentage should be positive");
        }
        this.capital = capital;
        this.percentage = percentage;
    }

    @Override
    public double calculateTax() {
        return capital * percentage / 100;
    }

    public String getCapital() {
        return String.format("%.2f€", capital);
    }

    public String getPercentage() {
        return String.format("%.2f€", percentage);
    }
}
