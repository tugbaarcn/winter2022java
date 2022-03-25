package practice05;

public class Q03 {

    public static void main(String[] args) {

        StringBuilder numbers = new StringBuilder("012345678");
        System.out.println(numbers.substring(1,3)); //12
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));//78

        /*
        What are the results of the following code? (Chose all that apply)
        ==>A. 12
        B. 123
        C. 7
      ==>  D. 78
      ==>  E. A blank line.
        F. An exception is thrown
        G. The code does not compile
         */

    }

}
