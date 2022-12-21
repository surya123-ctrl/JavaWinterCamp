package Assignment2Solution;


import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1. Issue Books");
        System.out.println("2. Get details");
        int ans = S.nextInt();
        Details d = new Details();
        Issue i = new Issue();
        GetDetails gd = new Details();
        switch (ans){
            case 1:
                System.out.println("welcome to our library management system. It's good to hear that you want to issue a book");
                i.BookName();
                i.AuthorName();
                i.BookPrice();
                i.BookNum();
                System.out.println("Thanks for Issuing the book");
                break;

            case 2:
                System.out.println("Hello user. I hear that you want to register in our library.");
                gd.Intro();
                d.Name();
                d.Age();
                d.Gender();
                d.Address();
                d.PhoneNum();
                System.out.println("Thanks for your time. Now enjoy reading from our unlimited stock of books.");
                break;

            default:
                System.out.println("Invalid input, please try again later.");
        }
        S.close();

    }
}
