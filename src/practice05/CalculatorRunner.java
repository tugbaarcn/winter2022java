package practice05;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(3,4,5,6);//The sum is: 18.0
        calculator.division(1,0);//I can not calculate that one..
        calculator.multiply(5,4,63,5);//The product is: 6300.0
        calculator.multiply(4,5);//The product is: 20.0
        calculator.substract(5,4);//The difference is :1.0


    }
}
