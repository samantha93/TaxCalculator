package com.sak.ceetiz;

import com.sak.ceetiz.bean.Company;
import com.sak.ceetiz.bean.SAS;
import com.sak.ceetiz.bean.SelfCompany;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SAS sas1 = new SAS(45000, "802 954 785 00028", "Sas company", "15 rue de Paris, 75001 Paris");
        SAS sas2 = new SAS(545000, "802 954 785 00024", "2nd SAS Company", "2nd SAS Company");
        SelfCompany self1 = new SelfCompany(150000, "802 954 785 00030", "My Self Company");
        SelfCompany self2 = new SelfCompany(3000000, "802 954 785 00050", "My 2nd self company");

        List<Company> companies = new ArrayList<>(4);
        companies.add(sas1);
        companies.add(sas2);
        companies.add(self1);
        companies.add(self2);

        companies.forEach(c -> {
            System.out.println(String.format("%s must pay %.2f€", c, c.calculateTax()));
        });
    }
}
