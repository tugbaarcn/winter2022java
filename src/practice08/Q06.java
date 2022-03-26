package practice08;

import java.util.Arrays;

public class Q06 {

    /*
     Create an array and create a  method to find the number of positive numbers and sum of
	 the non-positive numbers
	 Return type must be int array
	 [a,b]
		 */

    public static void main(String[] args) {

        int arr[] = {2, 6, 1, -9, -7, -2}; // [3, -18]
        System.out.println(Arrays.toString(countPosAddNonPos(arr)));//[3, -18]
    }
    public static int [] countPosAddNonPos(int arr []){

        int numOfPositives = 0;
        int sumOfNonPositives = 0;

        for(int w : arr){
            if(w > 0){
                numOfPositives++;
            } else {
                sumOfNonPositives = sumOfNonPositives + w;
            }
        }
        int result [] = {numOfPositives,sumOfNonPositives};
        return result;

    }
}
