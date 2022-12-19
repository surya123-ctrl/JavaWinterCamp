
package Assignment3Solution.Assignment3SolutionQuestions;


import java.util.Scanner;

//You will be given an input number N and N numbers following it as the input. You are also given an integer
//        K which represents how many times you have to rotate the array. Rotate the array
public class Assignment3Quest2 {
    static void rotateRight(int arr[], int k, int n) {
        int temp[] = new int[n];
        k %= n;
        int p = 0;
        for(int i=n-k; i<n; i++) temp[p++] = arr[i];
        for(int i=0; i<n-k; i++) temp[p++] = arr[i];
        for(int i=0; i<n; i++) System.out.print(temp[i] + " ");
    }
    static void rotateLeft(int arr[], int k, int n) {
        int temp[] = new int[n];
        k *= -1;
        k %= n;
        int p = 0;
        for(int i=k; i<n; i++) temp[p++] = arr[i];
        for(int i=0; i<k; i++) temp[p++] = arr[i];
        for(int i=0; i<n; i++) System.out.print(temp[i] + " ");
    }
    public static void reverse() throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        try {
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Bounds Exceeded...\nTry Again");
        }
        int k = sc.nextInt();
        if(k == 0) {for(int i=0; i<n; i++) System.out.print(arr[i] + " ");}
        else if(k > 0) {
            rotateRight(arr, k, n);
        }
        else {
            rotateLeft(arr, k, n);
        }
    }
}
