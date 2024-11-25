/*
         *****
         ****
         ***
         **
         *

 */

package patterns;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        for(int i=1; i<=input; i++){
            for(int j=input; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
