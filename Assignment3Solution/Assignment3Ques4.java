package Assignment3Solution;

import java.util.Scanner;

public class Assignment3Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int mn1 = Integer.MAX_VALUE, mn2 = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(arr[i] < mn1) {
                mn2 = mn1;
                mn1 = arr[i];
            }
            else if(arr[i] < mn2 && arr[i] != mn1) mn2 = arr[i];
        }
        int mx1 = Integer.MIN_VALUE, mx2 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(arr[i] > mx1) {
                mx2 = mx1;
                mx1 = arr[i];
            }
            else if(arr[i] > mx2 && arr[i] != mx1) mx2 = arr[i];
        }
        System.out.println("Minimum : " + mn1 + " Second Minimum : " + mn2);
        System.out.println("Maximum : " + mx1 + " Second Maximum : " + mx2);
    }
}
