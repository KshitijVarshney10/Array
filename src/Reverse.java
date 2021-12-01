/* Write a program to reverse the elements of a given 2*2 array.
    Four integer numbers needs to be passed as Command Line arguments.
*/

public class Reverse {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        int c = 0,d=3;
        if(args.length>=4) {
            System.out.println("Elements are: ");
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = Integer.parseInt(args[c]);
                    c++;
                }
            }
            System.out.println("The given array is : ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = Integer.parseInt(args[d]);
                    d--;
                }
            }
            System.out.println("The reversed array is : ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
        else
            System.out.println("Please Enter 4 integer numbers");
    }
}
