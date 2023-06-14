import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadzaj znaki (naciśnij 'k' aby zakończyć):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("k")) {
                break;
            }

            System.out.println("Wprowadzono: " + input);
        }

        scanner.close();
        System.out.println("Koniec programu.");
    }
}
