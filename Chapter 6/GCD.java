public class GCD {

    public static void main(String[] args) {
        int one = 48;
        int two = 18;
        int result = greatestCommon(one, two);
        System.out.println("GCD of " + one + " and " + two + " is: " + result);
    }


    public static int greatestCommon(int one, int two) {
        int denomonator1 = one;
        int denomonator = two;

        while (denomonator != 0) {
            int temp = denomonator;
            denomonator = denomonator1 % denomonator;
            denomonator1 = temp;
        }

        return denomonator1;
    }


}