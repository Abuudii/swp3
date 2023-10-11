package at.ana.basic;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Wuerfel_Beispiel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int winsOfPlayer=0;
        int winsOfComputer=0;
        int drawGames=0;
        char abbruch='n';

        System.out.println("Game Started!!");

        do {
            winsOfComputer=0;
            winsOfPlayer=0;
            drawGames=0;

            for (int i = 0; i < 6; i++) {
                int randomPlayer = random.nextInt(6) + 1;
                int randomComputer = random.nextInt(6) + 1;

                System.out.println("Computer:" + randomComputer + " Player:" + randomPlayer);

                if (randomPlayer < randomComputer) {
                    winsOfComputer++;

                } else if (randomPlayer > randomComputer) {
                    winsOfPlayer++;

                } else {
                    drawGames++;
                }

            }
            System.out.println('\n');
            System.out.println("Computer: " + winsOfComputer + "P");
            System.out.println("Player: " + winsOfPlayer + "P");
            System.out.println("Draw: " + drawGames);

            if (winsOfComputer > winsOfPlayer) {
                System.out.println("Computer Wins!");
            } else if (winsOfPlayer > winsOfComputer) {
                System.out.println("Player wins!");
            } else {
                System.out.println("Draw!");
            }

            System.out.println("Wollen Sie das Spiel wiederholen? j/n");
            abbruch = scanner.next().charAt(0);

        }while(abbruch == 'j');

        System.out.println("Spiel beendet");

    }

}
