package com.StudyInterface;

// import com.StudyInterface.TaxCalculate;

public class TaxReport {
private TaxCalculate calculator;

public TaxReport(TaxCalculate calculator) {
    this.calculator = calculator;
}

public void show() {
    var tax = calculator.calculateTax();
    System.out.println(tax);
}
}
