package lambda_functional_programming;

public class Utils {

    public static void printInSameLineWithSpace(Object o){
        System.out.print(o + " ");
    }

    public static void printElementsWithStar(Object o){
        System.out.println(o + "*");
    }

    public static boolean checkToBeEven(int x){
        return x % 2 ==0;
    }

    public static boolean checkToBeOdd(int x){
        return x % 2 != 0;
    }

    public static int getSquare(int x){
        return x*x;
    }

    public static int getCube(int x){
        return x*x*x;
    }

    public static double getHalfOfElement(int x){
        return x / 2.0;
    }

}
