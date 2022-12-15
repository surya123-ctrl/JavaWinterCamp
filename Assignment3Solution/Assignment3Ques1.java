//You are given an array of 0s and 1s in random order and you have to sort this array i.e Segregate 0s on the
//        left side and 1s on the right side of the array.

        package Assignment3Solution;

import java.util.Scanner;

public class Assignment3Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //0 1 1 0 1 0
        //0 1 2 3 4 5
        int i=0, j=0, temp=0;
        while(i<n) {
            if(arr[i] == 1) i++;
            else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        for(int k=0; k<n; k++) System.out.print(arr[k] + " ");
    }
}
