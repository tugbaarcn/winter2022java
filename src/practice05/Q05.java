package practice05;

public class Q05 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("M");

        sb.append("E");

        String add = "S";

        sb.append(add);

        sb.insert(1, "T");

        System.out.println(sb);

    }
}
