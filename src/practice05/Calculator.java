package practice05;

public class Calculator {

    /*
    Create a basic calculator, create add, subtract, multiply, divide methods.
    You can use varargs for addition and multiplication
    Create a Runner class...
     */

    public void add(double... v){
        double sum = 0;
        for(double w : v){
            sum = sum + w;
        }
        System.out.println("The sum is: " + sum);
    }


    public void substract(double a, double b){
        System.out.println("The difference is :" + (a - b));
    }


    public void multiply(double... a){
        double product = 1;
        for(double w : a){
            product = product * w;
        }
        System.out.println("The product is: " + product);
    }


    public void division(double a, double b){
        if(b == 0){
            System.out.println("I can not calculate that one..");
        } else {
            double c = a/b;
            System.out.println(c);
        }
    }

}
