package practice_extra;

public class Q05 {

    public static void main(String[] args) {

        /*
         * create a method(make return type boolean) to test
         * if an array contains a specific value-returns true or false
         * Then print the result in main method
         *
         * input[]= {1,2,3,4,5,6,7} num:6
         * Output : “Array contains 6”
         */

        int array[]= {1,2,3,4,5,6,7};
        int num = 9;

        //Call the method
        System.out.println(checkElement(array,num));

        if(checkElement(array,num)){
            System.out.println("Array contains " + num);
        } else {
            System.out.println("Array does not contain " + num);
        }
    }

    public static boolean checkElement(int array [], int num){

        boolean result = false;

        for(int each : array){

            if(each == num){

                result = true;

            }

        }
        return result;




    }


}
