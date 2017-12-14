public class Assessment {
    private static int[] arrayOfNumbers = {24, 43, 62, 99, 4};

    public static void main(String[] args) {
        System.out.println(square(8));
        System.out.println(sum(24, 19));
        System.out.println(average(arrayOfNumbers));
    }

    public static int square(int number) {
        return number * number;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double average(int[] numbers) {
        int total = 0;

        for (int n : numbers) {
            total += n;
        }

        return (double) total / numbers.length;
    }
}
