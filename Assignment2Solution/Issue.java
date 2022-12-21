package Assignment2Solution;//package winter_term_java;

import java.util.Scanner;

public class Issue implements IssueBooks{
    Scanner s = new Scanner(System.in);

    @Override
    public void BookName() {
        System.out.println("Enter the book name you want to issue : ");
        String book = s.nextLine();
    }
    @Override
    public void AuthorName() {
        System.out.println("Enter the author name of the book : ");
        String author = s.nextLine();
    }

    @Override
    public void BookPrice() {
        System.out.println("Enter price of the book you want to issue : ");
        String price = s.nextLine();
    }

    @Override
    public void BookNum() {
        System.out.println("Enter the number of the book : ");
        int num = s.nextInt();

    }
}
