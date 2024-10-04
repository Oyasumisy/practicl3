package practicl3;

import java.util.Scanner;
import java.text.MessageFormat;

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int integerValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введіть рядок: ");
        String stringValue = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // Використання System.out.println
        System.out.println("1. Ціле число: " + integerValue + ", Число з плаваючою точкою: " + doubleValue + ", Рядок: " + stringValue + ", Логічне значення: " + booleanValue);
        System.out.println("2. Число в науковому форматі: " + String.format("%.2e", doubleValue));
        System.out.println("3. Рядок у верхньому регістрі: " + stringValue.toUpperCase());

        // Використання MessageFormat
        String template = "4. Ціле число: {0}, Число з плаваючою точкою: {1}, Рядок: {2}, Логічне значення: {3}";
        String formattedMessage = MessageFormat.format(template, integerValue, doubleValue, stringValue, booleanValue);
        System.out.println(formattedMessage);

        template = "5. Ціле число у шістнадцятковій системі: {0}, Рядок у нижньому регістрі: {1}";
        formattedMessage = MessageFormat.format(template, Integer.toHexString(integerValue), stringValue.toLowerCase());
        System.out.println(formattedMessage);

        // Використання System.out.format
        String formatString = "6. Ціле число: %d, Число з плаваючою точкою: %.2f, Рядок: %s, Логічне значення: %b%n";
        System.out.format(formatString, integerValue, doubleValue, stringValue, booleanValue);
        System.out.format("7. Ціле число у шістнадцятковій системі: %x, Рядок у верхньому регістрі: %S%n", integerValue, stringValue);
        System.out.format("8. Octal Integer: %o, Double: %.4f%n", integerValue, doubleValue);
        System.out.format("9. Ціле число з ведучими нулями: %05d%n", integerValue);
        System.out.format("10. Ліво-вирівняне ціле число: %-5d, Рядок: %s%n", integerValue, stringValue);
    }
}