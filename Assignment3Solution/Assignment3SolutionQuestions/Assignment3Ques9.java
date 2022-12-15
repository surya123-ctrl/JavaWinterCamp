package Assignment3Solution.Assignment3SolutionQuestions;

import java.util.Scanner;

public class Assignment3Ques9 {
    public static void leader() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
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
