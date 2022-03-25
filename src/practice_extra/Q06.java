package practice_extra;

import java.util.Arrays;
import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {
              /*
        Interview Question
	 	Create a code that takes an array and
	 	returns the difference between the biggest and the smallest numbers.
	    Ask user to enter array elements.
	          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array..");
        int length = scan.nextInt();

        int array [] = new int[length];

        System.out.println("Enter elements..");

        for(int i = 0; i < length; i++){
            array[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int diffBetwMaxAndMin = array[array.length-1]  -  array [0];

        System.out.println("The difference between greatest and lowest element is " + diffBetwMaxAndMin);






















    }

}
