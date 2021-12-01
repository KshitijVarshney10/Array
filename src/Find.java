/* Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
*/

import java.util.Scanner;
public class Find {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter Number: ");
        int n=sc.nextInt(),c=0;
        for(int i=0; i<arr.length; i++){
            if(n==arr[i]) {
                c=i;
                break;
            }
        }
        if(c>0)
            System.out.println("Number is present at position: "+(c+1));
        else
            System.out.println("-1");
    }
}
