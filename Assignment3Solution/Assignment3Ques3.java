package Assignment3Solution;

import java.util.Scanner;

public class Assignment3Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int i=0; i<n; i++) {
            if(arr[i] > mx) mx = arr[i];
            if(arr[i] < mn) mn = arr[i];
        }
        System.out.println("Maximum : " + mx);
        System.out.println("Minimum : " + mn);
    }
}
