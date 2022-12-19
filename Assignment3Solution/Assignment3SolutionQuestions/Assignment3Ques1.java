//You are given an array of 0s and 1s in random order and you have to sort this array i.e Segregate 0s on the
//        left side and 1s on the right side of the array.

        package Assignment3Solution.Assignment3SolutionQuestions;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment3Ques1 {

    public static void sorting() throws ArrayIndexOutOfBoundsException {
        int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array : ");
            n = sc.nextInt();
            int arr[] = new int[n];
            try {
                for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Bounds Exceeded...\nTry Again");
        }
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
    public static void main(String[] args) {
    }
}