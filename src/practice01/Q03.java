package practice01;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

          /*
        Type java code by using ternary. Ask user to enter two integers
        Write a program to print the maximum  one on the console.(Do not forget they may be equal)
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers..");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println( a == b     ?      "They are equal "       :    a > b ?    a   :  b );




    }
}
