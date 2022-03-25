package practice05;

public class Q01 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb); //abbaccca
        /*
        What is the result of that code?
        A. abbaaccc
        B. abbaccca
        C. bbaaaccc
        D. An exception is thrown
        E. The code does not compile.

         */

    }

}
