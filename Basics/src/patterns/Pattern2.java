/*

         *
         **
         ***
         ****
         *****

 */

package patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        for(int i=0; i<input; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
