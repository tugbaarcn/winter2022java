package practice08;

import java.util.Arrays;
import java.util.HashMap;

public class Q03 {

 /*
  How to count the number of occurrences of the letters(alphabetical characters) in a sentence
  For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
                j=3, a=..,
                Make code case insensitive..
*/

    public static void main(String[] args) {

        String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
        String letters [] = str.replaceAll("[^A-Za-z]","").toLowerCase().split("");
        System.out.println(Arrays.toString(letters));
        //[j, a, v, a, i, s, e, a, s, y, t, y, p, e, c, o, d, e, s, t, o, l, e, a, r, n, j, a, v, a, t, o, e, a, r, n, m, o, n, e, y, l, e, a, r, n, j, a, v, a]

        HashMap<String,Integer> map = new HashMap<>();
        for( String w : letters){

            if( !map.containsKey(w) ){
                map.put(w,1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }
        System.out.println(map);//{a=10, c=1, d=1, e=7, i=1, j=3, l=2, m=1, n=4, o=4, p=1, r=3, s=3, t=3, v=3, y=3}

    }
}
