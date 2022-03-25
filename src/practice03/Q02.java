package practice03;

public class Q02 {

    public static void main(String[] args) {

        //Create a String array whose elements are : Ali, John, ALI, Brad, Mary, Ayse
        //print the elements whose indexes are even on the console

        String s [] = {"Ali", "John", "ALI", "Brad", "Mary", "Ayse"};

        for(int i = 0; i < s.length ; i++){

            if(i%2==0){

                System.out.println(s[i]);

            }
        }
    }
}
