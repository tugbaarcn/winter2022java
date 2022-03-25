package practice04;

import java.util.Arrays;

public class Q02 {

    public static void main(String[] args) {

        /*
        Write code to find the sum of the dollars and sum of the euros in the given string
         */
        String s = "$1 $12 €34 €56 $45 €78";
        String array [] = s.split(" ");//firstly I cut the string and put each element to an array by using split method.
        System.out.println(Arrays.toString(array));//[$1, $12, €34, €56, $45, €78]
        int sumDollars = 0;
        int sumEuros = 0;

        for(String w : array){
            if(w.contains("$")){
              sumDollars = sumDollars + Integer.valueOf( w.replace("$","")) ;
            } else {
               sumEuros = sumEuros + Integer.valueOf(w.replace("€","")  ) ;
            }

        }

        System.out.println("The sum of dollars: " + sumDollars);
        System.out.println("The sum of euros: " + sumEuros);




    }
}
