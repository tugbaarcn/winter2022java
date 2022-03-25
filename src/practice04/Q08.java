package practice04;

import java.util.ArrayList;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {

        /*
         * write a program to find the common elements between two String Arrays
         * (without case sensitivity)
         *
         * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [brad,sofia,emily]
         */

        String input1[] = { "John", "Brad", "Ange", "Sofia", "Emily" };
        String input2[] = { "sofia", "brad", "grace", "emily", "hazel" };

        List<String> output = new ArrayList<>();

        for (String w : input1){

            for(String x : input2){

                if(x.equalsIgnoreCase(w)){
                    output.add(x);
                }

            }

        }
        System.out.println(output); //[brad, sofia, emily]




    }
}
