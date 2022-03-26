package practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {

    /*
	 	Ebay Interview Question
	 	Create an array and get elements of array from user
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of array..");
        int length = scan.nextInt();

        int array[] = new int[length];

        System.out.println("Please enter the elements of array..");

        for(int i = 0; i < length; i++){
            array[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(array));

        //{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
        int brr [] = new int[length];
        int idx = 0;
        for(int i = 0; i < length; i++){
            if(array[i] != 0){
              brr[idx] = array[i];
              idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}
