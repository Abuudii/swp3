package at.ana.basic.Faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class TfFaker2 {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("insertDaten2.txt");

            for (int i = 0; i < 100; i++) {
                String name = faker.funnyName().name();
                String hersteller = faker.company().name();
                double preis = faker.number().randomDouble(2,20,200);

                String data = "insert into Medikamente(Name,Hersteller,Preis) values('"+ name + "','" + hersteller + "'," + preis+");";
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

