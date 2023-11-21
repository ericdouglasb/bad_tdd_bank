package org.example;

public class Main {
    public static void main(String[] args){

    double[] officeSizes = {42.7, 20.9, 38.7, 24.3, 12.5, 14.8, 14};

    for (var size : officeSizes){
        Office office = new Office(size);
        double monthlyRent = office.getMonthlyRent();
        System.out.println("kostnad för " + size + " kvm kontor: " + monthlyRent + " kr per månad");
        }
    }






}