import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){//zwykle uzycie scanner bez try powodowalo blad niedomkniecia wiec dodaje try zeby java zamknela go po uzyciu
        System.out.print("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = scanner.nextInt();
        System.out.println("Suma: " + (a + b));
        }
    }
}