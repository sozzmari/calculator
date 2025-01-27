import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;
        
        while (continueCalculation) {
            System.out.println("Выберите операцию: ");
            System.out.println("1. Сложение (+)");
            System.out.println("2. Вычитание (-)");
            System.out.println("3. Умножение (*)");
            System.out.println("4. Деление (/)");
            System.out.println("5. Квадратный корень");
            System.out.println("6. Расчет процента");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addition(scanner);
                    break;
                case 2:
                    subtraction(scanner);
                    break;
                case 3:
                    multiplication(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    squareRoot(scanner);
                    break;
                case 6:
                    percentage(scanner);
                    break;
                case 0:
                    continueCalculation = false;
                    System.out.println("Выход из программы.");
                    break;
                default:
                System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
    private static void addition(Scanner scanner) {
        System.out.println("Введите два числа через пробел: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Результат: " + (num1 + num2));
    }

    private static void subtraction(Scanner scanner) {
        System.out.println("Введите два числа через пробел: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Результат: " + (num1 - num2));
    }

    private static void multiplication(Scanner scanner) {
        System.out.println("Введите два числа через пробел: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Результат: " + (num1 * num2));
    }

    private static void division(Scanner scanner) {
        System.out.println("Введите два числа через пробел (делимое и делитель): ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            System.out.println("Результат: " + (num1 / num2));
        } else {
            System.out.println("Ошибка: деление на ноль недопустимо.");
        }
    }

    private static void squareRoot(Scanner scanner) {
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        if (number >= 0) {
            System.out.println("Квадратный корень: " + Math.sqrt(number));
        } else {
            System.out.println("Ошибка: квадратный корень от отрицательного числа не определен.");
        }
    }

    private static void percentage(Scanner scanner) {
        System.out.println("Введите число и процент через пробел: ");
        double number = scanner.nextDouble();
        double percent = scanner.nextDouble();
        System.out.println(percent + "% от " + number + " равно: " + (number * percent / 100));
    }
}
