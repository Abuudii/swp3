package at.ana.basic;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {


        char[][] field = new char[3][3];
        Scanner scanner= new Scanner(System.in);
        String Input = scanner.next();
        char cAbbruch='n';
        int Player1=0;
        int Player2=0;

        System.out.println("-----------------------");
        System.out.println("Zeawas jetzt TicTacTou");
        System.out.println("Gewinner bekommt eine Cola!");
        System.out.println("-----------------------");

        do {
//noch nicht fertig


            System.out.println("Wollen Sie ");
            cAbbruch = scanner.next().charAt(0);
        }while(cAbbruch=='j');
    }
}
