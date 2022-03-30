package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01 {
    /*
    Lambda is functional programming, we had Lambda in Java with version 8.
    Functional programming focuses on "what to do", with structured programming we focus "how to do"
    Functional programming is used with Collections, Arrays..
    We can not use functional programming with maps, but we can convert Maps to Collection by using entrySet() method and we can use
    functional programming.
     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        printElementsStructured(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctElements(l);
        System.out.println();
        getMaxElement01(l);
        getMaxElement02(l);
        getMinimumEvenGreaterThanSeven01(l);//8
        getMinimumEvenGreaterThanSeven02(l);//8
        getMinimumEvenGreaterThanSeven03(l);
        halfOfDistinctElementsGreaterThanFive(l);


    }

    //1)Create a method to print the list elements on the console in the same line with a space between consecutive elements(Structured)
    public static void printElementsStructured(List<Integer> list){
        for(Integer w : list){
            System.out.print( w + " ");
        }
    }

    //1)Create a method to print the list elements on the console in the same line with a space between consecutive elements(Functional)
    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach( t -> System.out.print( t + " ") );
    }

    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
    public static void printEvenElementsStructured(List<Integer> list){
        for(Integer w : list){
            if( w % 2 == 0){
                System.out.print(w + " ");
            }
        }
    }

    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter( t -> t % 2 == 0).forEach( t -> System.out.print(t + " "));
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    // space between two consecutive elements.(Functional)
    //   odd ==> square ==> print
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter( t -> t % 2 != 0).map( t -> t*t).forEach( t -> System.out.print(t + " "));
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements.
    //
    //elements should be distinct(unique)
    //elements should be odd
    //we should calculate cubes
    //elements should be printed.
    public static void printCubeOfDistinctElements(List<Integer> list){
        list.stream().distinct().filter( t -> t % 2 != 0).map( t -> t*t*t).forEach(t -> System.out.print( t + " "));
    }

    //5)Create a method to find the maximum value from the list elements ==> stream, distinct,
    //1.way
    public static void getMaxElement01(List<Integer> list){
     Integer maxValue = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u) -> t > u ? t : u);
     System.out.println(maxValue);
    }                                               //8 9 131 10 9 10 2 8 15
    //2.way:
    public static void getMaxElement02(List<Integer> list){
       Integer maxValue = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u) -> u); //gives last element
       System.out.println(maxValue);
    }

    //6)Homework: Create a method to find the minimum value from the list elements(In 2 ways)

    //7)Create a method to find the minimum value which is greater than 7 and even from the list
    //more than 7, even, min value
    //1.Way:
    public static void getMinimumEvenGreaterThanSeven01(List<Integer> list){
     Integer minEvenValueGreaterThanSeven = list.stream().
                                                         distinct().
                                                         filter( t -> t > 7 ).
                                                         filter( t -> t % 2 == 0).
                                                         reduce(Integer.MAX_VALUE, (t,u) -> t > u ? u : t );
        System.out.println(minEvenValueGreaterThanSeven);
    }
    //2.Way:
    public static void getMinimumEvenGreaterThanSeven02(List<Integer> list){
        Integer minEvenValueGreaterThanSeven = list.stream().
                                                           distinct().
                                                           filter( t -> t > 7 ).
                                                           filter( t -> t % 2 == 0).
                                                           sorted(Comparator.reverseOrder()).
                                                           reduce(Integer.MAX_VALUE,(t,u) -> u);
        System.out.println(minEvenValueGreaterThanSeven);
    }

    //3.Way:
    public static void getMinimumEvenGreaterThanSeven03(List<Integer> list) {
        Integer minEvenValueGreaterThanSeven = list.stream().
                                                            distinct().
                                                            filter(t -> t > 7).
                                                            filter(t -> t % 2 == 0).
                                                            sorted().
                                                            findFirst().
                                                            get();
        System.out.println(minEvenValueGreaterThanSeven);
    }

    //8)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    //distinct, filter, map, sorted,
    public static void halfOfDistinctElementsGreaterThanFive(List<Integer> list){
      List<Double> result =  list.stream().distinct().filter( t -> t > 5).map( t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
      System.out.println(result);
    }
}
