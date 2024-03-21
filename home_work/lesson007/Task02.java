package home_work.lesson007;

import static java.lang.Integer.*;

public class Task02 {
    public static void main(String args[]) {
        //boolean byte short int long char float double
        byte b = 100;
        float sh = -32800000000000000000000000000000000000F;
        System.out.println(sum(b, sh, sh));
    }

    static boolean sum(boolean... nums) {
        boolean sum = true;
        for (boolean num : nums) {
            sum &= num;
        }
        System.out.println(((Object) nums[0]).getClass().getName());
        return sum;
    }

    static byte sum(byte... nums) {
        long sum = 0;
        for (byte num : nums) sum += num;

        System.out.println(((Object) nums[0]).getClass().getName());
        if ((sum > Byte.MAX_VALUE) || (sum < Byte.MIN_VALUE)) System.out.println("ALARM overflow!!!");
        return (byte) sum;
    }

    static short sum(short... nums) {
        long sum = 0;
        for (short num : nums) sum += num;

        System.out.println(((Object) nums[0]).getClass().getName());
        if ((sum > Short.MAX_VALUE) || (sum < Short.MIN_VALUE)) System.out.println("ALARM overflow!!!");
        return (short) sum;
    }

    static int sum(int... nums) {
        long sum = 0;
        for (int num : nums) sum += num;

        System.out.println(((Object) nums[0]).getClass().getName());
        if ((sum > Integer.MAX_VALUE) || (sum < Integer.MIN_VALUE)) System.out.println("ALARM overflow!!!");
        return (int) sum;
    }

    static long sum(long... nums) {
        long sum = 0;
        for (long num : nums) sum += num;

        System.out.println(((Object) nums[0]).getClass().getName());
        return sum;
    }

    static float sum(float... nums) {
        double sum = 0;
        for (float num : nums) sum += num;

        System.out.println(((Object) nums[0]).getClass().getName());
        if ((sum > Float.MAX_VALUE) || (sum < (-1 * Float.MAX_VALUE))) System.out.println("ALARM overflow!!!");
        return (float) sum;
    }
}
