package practice_extra;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {


        /*
         * create a method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         */

        //call the method
        charArray("Ali Can");


    }
    //create a method
    public static void charArray(String str){

        char array[] = new char[str.length()];

        for(int i = 0; i<str.length(); i++){

            array[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(array));

    }

















}
