import java.util.Scanner;

public class BMICalculatorApp {

    static void main() {
        System.out.println("BMI Calculator 18.0");

        Scanner tastatur = new Scanner(System.in);
        int bodySize; // Deklaration
        double weight; // Deklaration
        double bmi = 0; // Deklaration + Initialisierung

        System.out.print("Körpergröße: ");
        bodySize = tastatur.nextInt(); // Hier passiert die Initialisierung

        System.out.print("Weight: ");
        weight = tastatur.nextDouble();

        bmi = weight / ((bodySize / 100.0) * (bodySize / 100.0));

        System.out.println("BMI: " + bmi);

        if (bmi <= 16) {
            System.out.println("Starkes Untergewicht");
        }
        else if (bmi <= 17) {
            System.out.println("Mäßiges Untergewicht");
        }
        else if (bmi <= 18.5) {
            System.out.println("Leichtes Untergewicht");
        }
        else if (bmi < 25) {
            System.out.println("Normalgewicht");
        }
        else if (bmi < 30) {
            System.out.println("Präadipositas");
        }
        else if (bmi < 35) {
            System.out.println("Adipositas Grad I");
        }
        else if (bmi < 40) {
            System.out.println("Adipositas Grad II");
        }
        else {
            System.out.println("Adipositas Grad III");
        }



    }


}
