package home_work.lesson007;

public class Task04 {
    public static void main(String args[]) {
        System.out.println(recurs(3));
    }

//    static double recurs(int n){
//        if (n < 1) {
//            System.out.println("n < 1");
//            return 0.0;
//        }
//        return recurs(n - 1 ) + Math.sqrt(n);
//    }

    static double recurs(double n) {
        if (n < 1) {
            System.out.println("n < 1");
            return 0.0;
        }
        return recurs(n - 1) + Math.sqrt(n);
    }
}
