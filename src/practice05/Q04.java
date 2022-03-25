package practice05;

public class Q04 {

    public static void main(String[] args) {

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1,2).length();
        total += letters.substring(6,6).length();
        total += letters.substring(6,5).length();
        System.out.println(total);

         /*
        A. 1
        B. 2
        C. 3
        D. 7
        ==>E. An exception is thrown.
         */

    }

}
