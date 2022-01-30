
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad2 {
    public static void main() {
        System.out.println("Podaj liczbe: ");
        Scanner scan = new Scanner(System.in);
        double inputValue = 0;
        while (true) {
            try {
                inputValue = scan.nextDouble();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("podaj poprawną liczbe!");
                scan.next();
            }
        }

        if (inputValue < 0) {
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje!", inputValue));
        }

        System.out.printf("Pierwiastek z %.4f to %.4f.", inputValue, Math.sqrt(inputValue));
    }
}