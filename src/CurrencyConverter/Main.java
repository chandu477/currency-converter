package CurrencyConverter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Base Currency: ");
        System.out.println("1.INDIAN");
        System.out.println("2.US DOLLAR");
        System.out.println("3.EURO");
        System.out.println("4.Canadian Dollar");
        System.out.println("5.Australian Dollar");

        int input_num1 = sc.nextInt();


        System.out.println("Enter Amount:");
        int amount = sc.nextInt();


        System.out.println("Select Target Currency:");


        System.out.println("1.INDIAN");
        System.out.println("2.US DOLLAR");
        System.out.println("3.EURO");
        System.out.println("4.Canadian Dollar");
        System.out.println("5.Australian Dollar");

        int input_num2 = sc.nextInt();


        if (input_num1 == 1) {
            IndianRupees indian = new IndianRupees();
            indian.calculate(amount, input_num2);

        } else if (input_num1 == 2) {
            Usd us = new Usd();
            us.calculate(amount, input_num2);

        } else if (input_num1 == 3) {
            Euro e = new Euro();
            e.calculate(amount, input_num2);

        } else if (input_num1 == 4) {
            CanadianDollar cd = new CanadianDollar();
            cd.calculate(amount, input_num2);

        } else if (input_num1 == 5) {
            AustralianDollar as = new AustralianDollar();
            as.calculate(amount, input_num2);
        } else {
            System.out.println("Invalid currency choice");
        }
    }

}



