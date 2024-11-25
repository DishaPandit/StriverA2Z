/*

        12345
        1234
        123
        12
        1

 */

package patterns;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        for(int i=1; i<=input; i++){
            for(int j=1; j<=input-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
