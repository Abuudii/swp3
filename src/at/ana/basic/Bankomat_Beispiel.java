package at.ana.basic;

import java.util.Scanner;

public class Bankomat_Beispiel {
    public static void main(String[] args) {

        int Auswahl=0;
        double Kontostand = 0;
        Scanner scanner = new Scanner(System.in); // Für das Einlesen der eingabe

        System.out.println("1.Einzahlen");
        System.out.println("2.Abheben");
        System.out.println("3.Kontostand");
        System.out.println("4.Beenden");



        do {
            Auswahl = scanner.nextInt();

            switch (Auswahl) {
                case 1:
                    System.out.println("Wie viel Geld wollen Sie einzahlen?");
                    double Einzahlung = scanner.nextDouble();
                    Kontostand = Kontostand + Einzahlung;
                    System.out.println("Ihre Einzahlung" + Einzahlung + " € war erfolgreich");
                    break;
                case 2:
                    System.out.println("Wie viel Geld wollen Sie abheben?");
                    double Auszahlung = scanner.nextDouble();
                    Kontostand = Kontostand - Auszahlung;
                    System.out.println("Ihre Auszahlung" + Auszahlung + " € war erfolgreich");
                    break;
                case 3:
                    System.out.println("Ihr Kontostand betraegt " + Kontostand + " €");
                    break;

            }
        } while (Auswahl != 4);


    }
}
//Fertig
