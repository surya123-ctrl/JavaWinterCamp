package Assignment3Solution.Assignment3SolutionQuestions;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Assignment3Ques5 {
    public static void findDistance() throws ArrayIndexOutOfBoundsException {
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
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int minDist = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if((arr[i] == n1 && arr[j] == n2) || (arr[i] == n2 && arr[j] == n1) && minDist > abs(i-j))
                    minDist = abs(i-j);
            }
        }
        if(minDist > n) System.out.println(-1);
        else System.out.println(minDist);
    }
}
