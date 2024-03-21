package home_work.lesson007;

public class Task01 {

    public static void main(String[] args) {
        String s1 = "sgsdgsg", s2 = "dgaath", s3 = "pohm,", s4 = "1wgv5";
        String s = concat(s1, s2, s3, s4);
        System.out.print(s);
    }

    static String concat(String... words) {
        String s = "";
        for (String word : words) {
            s += word + " ";
        }
        return s;
    }

}
