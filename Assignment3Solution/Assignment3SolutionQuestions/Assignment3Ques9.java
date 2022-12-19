package Assignment3Solution.Assignment3SolutionQuestions;

import java.util.Scanner;

public class Assignment3Ques9 {
    public static void leader() throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        try {
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Bounds Exceeded...\nTry Again");
        }
        int lead = arr[n-1];
        System.out.println(lead + " ");
        for(int i=n-2; i>=0; i--) {
            if(lead < arr[i]) {
                lead = arr[i];
                System.out.println(lead + " ");
            }
        }
    }
}
