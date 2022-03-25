package practice01;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        /*
        A company decided to give bonus of 5% of salary to employee if his/her year of
        service is 5 and more than 5 years.
        Ask user for their salary and year of service and print the net bonus amount.
        If employee can not get bonus, print how many more years he/she should work.

        EXAMPLE:
        INPUT   :   Year    => 4 year service
                    Salary  => 4000

        OUTPUT :  You need to work 1 year(s) to get bonus
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year of the service");
        int year = scan.nextInt();
        System.out.println("Enter your salary..");
        int salary = scan.nextInt();

        if(  year < 0  || salary <0  ){
            System.out.println("Please enter valid datas..");
        } else if (  year >= 0  &&  year <5  ){
            System.out.println("You should work :" + (5-year)  + "year(s)..." );
        } else {
            System.out.println("Your bonus is: " + salary * 5 / 100);


        }












    }
}
