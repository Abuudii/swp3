package at.ana.basic;

import java.util.Random;

public class Loop_1_2 {
    public static void main(String[] args) {

        int iNumber=0;

        //Aufgabe Loop1
        for(int i = 0; i<=100;i++)
        {
          iNumber=iNumber+i;
        }
        System.out.println(iNumber);


        //Aufgabe Loop2
        int b = 0;

        for (int j = 0; j <= 1000; j = j + 2) {
            b = b + j;
        }

        System.out.print(b);
    }
}
