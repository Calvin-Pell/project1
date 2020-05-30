public class Calc {

    /*
     *Returns the sum of num1 and num2, rounded to five decimal places if necessary.
     */
    public static double add(double num1, double num2) {
        double res = num1 + num2;
        res = roundNum(res);
        return res;
    }

    /*
     *Returns the difference of num1 minus num2, rounded to five decimal places if necessary.
     */
    public static double subtract(double num1, double num2) {
        double res = num1 - num2;
        res = roundNum(res);
        return res;
    }

    /*
     *Returns the product of num1 and num2, rounded to five decimal places if necessary.
     */
    public static double multiply(double num1, double num2) {
        double res = num1 * num2;
        res = roundNum(res);
        return res;
    }

    /*
     *Returns the quotient of num1 divided by num2, rounded to five decimal places if necessary.
     */
    public static double divide(double num1, double num2) {
        double res = num1 / num2;
        res = roundNum(res);
        return res;
    }

    /*
     *Returns num rounded to five decimal places. This is done by multiplying num by 100000,
     * int casting it to cut off any remaining decimal values, then dividing it by 100000 so that
     * num's value is approximately the same as before.
     */
    private static double roundNum(double num) {
        int temp = (int)(num * 100000);
        num = (temp * 1.0) / 100000;
        return num;
    }
}
