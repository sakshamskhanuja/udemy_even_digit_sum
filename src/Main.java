public class Main {
    public static void main(String[] args) {
        // Calculates the sum of even numbers in 123456789.
        System.out.println(getEvenDigitSum(123465789));

        // Calculates the sum of even numbers in 252.
        System.out.println(getEvenDigitSum(252));

        // Calculates the sum of even numbers in -22.
        System.out.println(getEvenDigitSum(-22));
    }

    /**
     * Calculates the sum of even digits inside a number.
     */
    public static int getEvenDigitSum(int number) {
        // Checks for invalid value.
        if (number < 0) {
            return -1;
        }

        // Stores the sum of all even digits in the number.
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }
}