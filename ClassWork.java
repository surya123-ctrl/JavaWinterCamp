import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWork {
    public static void doMoreStuff() {
        System.out.println(10/0);
    }
    public static void doStuff() {
        doMoreStuff();
    }
    public static void main(String[] args) {
//        String str1 = new String("Hello");
//        str1.concat("world");
//        System.out.println(str1);
//        StringBuffer str2 = new StringBuffer("Hello");
//        str2.append("World");
//        System.out.println(str2);
//        String s1 = new String("Hello");
//        String s2 = new String("Hello");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        StringBuffer s3 = new StringBuffer("Hello");
//        StringBuffer s4 = new StringBuffer("Hello");
//        System.out.println(s3 == s4);
//        System.out.println(s3.equals(s4));
//        final StringBuffer a1 = new StringBuffer("Hello");
//        a1.append("World");
//        System.out.println(a1);
//        StringBuffer a2 = new StringBuffer("monday");
//        System.out.println(a2);
        try{
            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("Not inputted integer value");
        }
//        doStuff();
    }
}
