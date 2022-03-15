package main;

import entities.Financing;

public class Main {

    public static void main(String[] args) {

        try {
            Financing f1 = new Financing( 100000.0, 2000.0, 20);
            System.out.println("Financing data 1: ");
            System.out.printf("Entry : %.2f%n",f1.entry());
            System.out.printf("Installment: %.2f%n",f1.quota());
    }catch (IllegalArgumentException e ){
            System.out.println("Error in financing  1: " + e.getMessage());
        }

        try {
            Financing f2 = new Financing(100000.00,2000.00,80);

            System.out.println("\nFinancing data 2: ");
            System.out.printf("Entry : %.2f%n",f2.entry());
            System.out.printf("Installment: %.2f%n",f2.quota());

        }catch (IllegalArgumentException e ){
            System.out.println("Error in financing  2: " + e.getMessage());
        }

    }
}
