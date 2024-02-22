import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String result = calc(str);


        System.out.println(result);

    }

    public static String calc(String input) throws IOException {
        String resulString = input.replaceAll(" ", "");
        String[] array = resulString.split("[^A-Fa-f0-9]");

        int num1 = Integer.parseInt(array[0]);
        if (num1 <= 0 || num1 > 10) {
            throw new IOException ();
        }
        int num2 = Integer.parseInt(array[1]);
        if (num2 <= 0 || num2 > 10) {
            throw new IOException();
        }
        String symbol =resulString.replaceAll("\\d+(.*?)", "$1");
        int result = 0;
        char operation = symbol.charAt(0);
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                throw new IOException("Неправильный символ операции");

        }
        return String.valueOf(result);
    }
}

