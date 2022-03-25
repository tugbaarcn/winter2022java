package practice05;

public class Q06 {

    public static void main(String[] args) {

        //Type a code that joins the given Strings
        //input => "Dear", "Ali", "Can", "we", "miss", "you"
        //output => "Dear Ali Can we miss you"

        join("Dear","Ali","Can","we","miss","you");
    }

    public static void join(String... str){
        String result = "";
        for(String each : str){
            result = result + each + " ";
        }
        System.out.println(result);
    }
}
