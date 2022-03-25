package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

           /*
        Ask user to enter an integer, and create a squared multidimensional Array
		Example: If user enters 3 ==> [[3, 3, 3],[3, 3, 3],[3, 3, 3]]
		         If user enters 4 ==> [[4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4]]
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer..");
        int length = scan.nextInt(); //[[2,2],[2,2]]

        if(length<0){
            System.out.println("Hey user what are you doing, write a positive number..");
        } else {

            int array [][] = new int[length][length];

            for(int i = 0; i < length; i++){

                for(int j = 0; j < length; j++){ //[[3, 3, 3], [3, 3, 3], [3, 3, 3]]

                    array[i][j] = length;
                }
            }
            System.out.println(Arrays.deepToString(array));
        }

    }
}
