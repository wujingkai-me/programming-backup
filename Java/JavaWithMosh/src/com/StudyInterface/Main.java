package com.StudyInterface;

public class Main {
    public static void main(String[] args) {
        TaxCalculator2022 calculate = new TaxCalculator2022(10_000);
        TaxReport report = new TaxReport(calculate);
    }
}
