
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;
import java.lang.String;

public class Ex20 {
    public static String stateWI = "WISCONSIN";
    public static String stateIL = "ILLINOIS";
    public static String countyEC = "EAU CLAIRE";
    public static String countyD = "DUNN";

    public static void main(String[] args) {

        double total, tax = 0, order;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        String orderString = scanner.nextLine();
        order = Integer.parseInt(orderString);

        System.out.println("What state do you live in? ");
        String input = scanner.nextLine();
        String state = input.toUpperCase();

        if(stateWI.equals(state)){
            System.out.println("What county do you live in? ");
            String input2 = scanner.nextLine();
            String county = input2.toUpperCase();

            if(county.equals(countyEC)){
                tax = order * (0.05 + 0.005);
                total = order * ((0.05 + 0.005) * 100);
            }
            else if(county.equals(countyD)){
                tax = order * (0.05 + 0.004);
                total = order * ((0.05 + 0.004) * 100);
            }
            else{
                tax = order * 0.05;
                total = order * (0.05 * 100);
            }
        }
        else if(stateIL.equals(state)) {
            tax = order * 0.08;
            total = order * (0.08 * 100);
        }
        else{
            total = order;
        }

        System.out.println("The tax is $" + tax);
        System.out.println("The total is $" + total);
    }
}