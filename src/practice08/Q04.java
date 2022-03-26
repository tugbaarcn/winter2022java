package practice08;

import java.util.Scanner;

public class Q04 {

    /*
     * Ask user to enter 2 positive integer then find
     * GCD (The Greatest Common Divisor) and
     * (if user enter 30 and 40 GCD = 10 )
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 positive integers..");
        int num1 = Math.abs(scan.nextInt());
        int num2 = Math.abs(scan.nextInt());

        int gcd = 1;

        for(int i =1; i <= num1 && i<= num2; i++){
            if(num1 % i == 0  && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + gcd);

    }
}
