package Assignment2Solution;//package winter_term_java;

import java.util.Scanner;

public class Details extends GetDetails{
    Scanner sc = new Scanner(System.in);
    @Override
    void Name() {
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
    }

    @Override
    void Age() {
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
    }

    @Override
    void Gender() {
        System.out.println("Enter your gender : ");
        String gender = sc.nextLine();
        sc.nextLine();
    }

    @Override
    void PhoneNum() {
        System.out.println("Enter your phone number : ");
        String number = sc.nextLine();
    }

    @Override
    void Address() {
        System.out.println("Enter address : ");
        String address = sc.nextLine();
    }
}

