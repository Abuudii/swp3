package at.ana.basic.Faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TfFaker5 {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("insertDaten5.txt");

            for (int i = 0; i < 100; i++) {
                int number = faker.number().numberBetween(1,100);

                String data = "insert into Bestellpositionen(BestellungsID,MedikamentID,Menge) values("+  number+ "," + number + "," + number + ");";
                myWriter.write(data + "\n"); // Append a newline after each set of data
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
