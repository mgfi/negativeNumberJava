import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadzenie danych przez użytkownika
        System.out.println("Podaj ciąg liczb oddzielonych spacjami:");
        String input = scanner.nextLine();

        // Podzielenie ciągu na poszczególne liczby
        String[] numbers = input.split(" ");

        // Flaga określająca, czy liczby nieujemne zostały znalezione
        boolean hasNonNegative = false;

        for (String number : numbers) {
            try {
                int value = Integer.parseInt(number);
                if (value >= 0) {
                    hasNonNegative = true;
                    break; // Nie trzeba szukać dalej
                }
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format liczby: " + number);
                return;
            }
        }

        // Wyświetlenie wyniku
        if (hasNonNegative) {
            System.out.println("Ciąg zawiera liczby nieujemne.");
        } else {
            System.out.println("Ciąg nie zawiera liczb nieujemnych.");
        }

        scanner.close();
    }
}