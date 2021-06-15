public class ReverseInteger {


    public static void main(String[] args) {
        System.out.println(reverse(-321));
        System.out.println(reverse(123));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(1463847412));

    }

    public static int reverse(int x) {
        String strNumber = String.valueOf(x);
        String revNumber = "";
        for (int i = strNumber.length() - 1; i >= 0; i--) {
            if (strNumber.charAt(i) == '-') {
                continue;
            } else {

                revNumber += strNumber.charAt(i);
            }
        }
        //get sigNum
        if (x == 0 || Long.valueOf(revNumber) > 2147483647) {
            return 0;
        }
        if (Integer.MAX_VALUE > x && Integer.MAX_VALUE > Integer.valueOf(revNumber)) {
            return Integer.valueOf(revNumber) * (Integer.signum(x));
        }

        return 0;
    }
}
