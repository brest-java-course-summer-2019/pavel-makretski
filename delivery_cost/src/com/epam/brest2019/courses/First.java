package com.epam.brest2019.courses;

import java.math.BigDecimal;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        First first = new First();
        BigDecimal weight = new BigDecimal(first.setVariable());
        BigDecimal distance = new BigDecimal("10000");
        BigDecimal pricePerKg = new BigDecimal("30");
        BigDecimal pricePerKm = new BigDecimal("50");

        BigDecimal price = weight.multiply(pricePerKg).add(distance.multiply(pricePerKm));
        System.out.println("Total price: " + price);

    }

    public String setVariable(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите величину; ");
        String var = scan.nextLine();
        return var;
    }
}