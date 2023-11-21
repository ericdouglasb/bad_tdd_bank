package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Office {
    private static final int RENT_SMALL_OFFICE = 3200;
    private static final int RENT_LARGE_OFFICE = 2785;
    private static final int OFFICE_SIZE_BREAKPOINT = 20;
    private static final int OFFICE_TAX = 150;



    private final double size;

    public Office(double squareMeters){
        this.size = squareMeters;

    }

    public double getMonthlyRent() {
        double yearlyRent = getYearlyRent();
        double monthlyRent = round( yearlyRent / 12, 2);

        return monthlyRent;
    }
    private double getYearlyRent(){
        double yearlySpaceRent = getYearlySpaceRent();
        double yearlyTax = getYearlyTax();

        return yearlySpaceRent + yearlyTax;
    }

    private double getYearlyTax() {
        return OFFICE_TAX * size;
    }

    private double getYearlySpaceRent() {
        if (size <OFFICE_SIZE_BREAKPOINT){
            return RENT_SMALL_OFFICE*size;
        }else {
            return RENT_LARGE_OFFICE*size;
        }
    }

    public double round (double value, int places){
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd .setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }


}