package Assignment3Solution.Assignment3SolutionQuestions;

import java.util.Scanner;

public class Assignment3Ques6 {
    public static void inDel() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
        int pos;
        pos = sc.nextInt();
        for(int i=pos; i<n; i++) arr[i] = arr[i+1];
        for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
    }
}
