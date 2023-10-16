public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        math();
    }

    public static void math() {
        double[] numbers = {8.0, -2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 2.0, 3.0, 2.0, 6.0, 1.0, 7.0, 8.0, 5.0};
        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        for (double number : numbers) {
            if (number < 0) {
                foundNegative = true;
            } else if (foundNegative) {
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
        } else {
            System.out.println("Нет положительных чисел после первого отрицательного числа.");
        }
    }
}
