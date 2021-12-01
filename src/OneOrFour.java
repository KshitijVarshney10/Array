/* Given an array of type int, print true if every element is 1 or 4. */

import java.util.Scanner;
public class OneOrFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n],f=0;
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]==1 || a[i]==4)
                f++;
            else {
                f=0;
                break;
            }
        }
        if(f>0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
