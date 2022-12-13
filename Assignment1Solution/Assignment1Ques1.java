//WAP to sort string without using string methods
package Assignment1Solution;
import java.util.Scanner;
public class Assignment1Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");;
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        char temp;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
