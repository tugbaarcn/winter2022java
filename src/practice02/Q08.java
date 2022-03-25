package practice02;

import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {


         /*
	 Get the number of rows from user then draw a right triangle by using asterixs
	 Number of rows = 4 ==>    *
	                           * *
	                           * * *
	                           * * * *
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row number..");
        int row = scan.nextInt();

        for( int i =1; i< row + 1 ; i++){

            for(int j = 1; j< i +1 ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }





    }

}
