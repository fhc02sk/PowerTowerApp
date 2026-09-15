import java.util.Scanner;

public class PowerTowerApp {

    static void main() {
        System.out.println("Willkommen zum Power-Tower-Calculator 2.0");
        Scanner tastatur = new Scanner(System.in); // Damit kann ich auf die Tastatur zugreifen

        System.out.print("Bitte Zahl eingeben: ");
        long number = tastatur.nextInt();

        if (number > 99999999) {
            System.out.println("Input Zahl ist zu groß");
            return;
        }

        long result = number;
        int multiplicator = 2;

        do {
            number = result;
            result = number * multiplicator;
            System.out.println(number + " * " + multiplicator + " = " + result);
            multiplicator = multiplicator + 1;
        } while (multiplicator <= 9);

        int divisor = 2;
        do {
            number = result;
            result = number / divisor;
            System.out.println(number + " / " + divisor + " = " + result);
            divisor = divisor + 1;
        } while (divisor <= 9);

        /*number = result;
        result = number * 3;
        System.out.println(number + " * 3 = " + result);
        // STRG+D
        number = result;
        result = number * 4;
        System.out.println(number + " * 4 = " + result);

        number = result;
        result = number * 5;
        System.out.println(number + " * 5 = " + result);*/


    }

}
