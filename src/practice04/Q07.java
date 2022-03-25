package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        /*
		A list has elements “M”, “K” and “P”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		*/

        List<String> list = new ArrayList<>();
        list.add("M");
        list.add("K");
        list.add("P");
        System.out.println(list); //[M, K, P] + L ==> [M, K, P, L]

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter please");
        String letter = scan.next().toUpperCase();

        if(list.contains(letter)){
            list.set(list.indexOf(letter), "Got it!");
        } else {
            list.add(letter);
        }

        System.out.println(list);

















    }
}
