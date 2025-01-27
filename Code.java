import java.util.Scanner;

public class Code {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Зашифровать текст");
            System.out.println("2. Дешифровать текст");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    encryptText(scanner);
                    break;
                case 2:
                    decryptText(scanner);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }
    }

    private static void encryptText(Scanner scanner) {
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();
        System.out.println("Введите шифровальный ключ (целое число):");
        int key = scanner.nextInt();

        String encryptedText = caesarCipher(text, key);
        System.out.println("Зашифрованный текст: " + encryptedText);
    }

    private static void decryptText(Scanner scanner) {
        System.out.println("Введите зашифрованный текст:");
        String text = scanner.nextLine();
        System.out.println("Введите шифровальный ключ (целое число):");
        int key = scanner.nextInt();

        String decryptedText = caesarCipher(text, -key);
        System.out.println("Расшифрованный текст: " + decryptedText);
    }

    private static String caesarCipher(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // Сдвигаем символ с учётом алфавита
                c = (char) ((c - base + key + 26) % 26 + base);
            }
            result.append(c);
        }

        return result.toString();
    }
}