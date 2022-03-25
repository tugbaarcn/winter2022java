package practice04;

import java.util.ArrayList;
import java.util.List;

public class Q05 {

    public static void main(String[] args) {

        /*
         * Create an integer array with 5 elements
         * Convert to a list
         * Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
         * Increase the value of every element by 3
         * Print the multiplication of the elements from index 2 to index 5
         */
        int arr[] = {4,5,6,8,9};

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i< arr.length; i++){
            list.add(arr[i]);
        }

        System.out.println(list);//[4, 5, 6, 8, 9]

        list.add(0,11);//[11, 4, 5, 6, 8, 9]
        list.add(3,13);;//[11, 4, 5, 13, 6, 8, 9]

        System.out.println(list);//[11, 4, 5, 13, 6, 8, 9]

        for(int j = 0; j < list.size() ; j++){
            list.set(j,list.get(j) + 3);
        }
        System.out.println(list);//[14, 7, 8, 16, 9, 11, 12]

        int product = 1;
//                     k<=5
        for(int k = 2; k<6 ; k++){
            product = product * list.get(k);
        }
        System.out.println(product); //12672




    }

}
