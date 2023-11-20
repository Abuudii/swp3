package at.ana.basic.Faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TfFaker4 {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("DE-AT"));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            FileWriter myWriter = new FileWriter("insertDaten4.txt");

            for (int i = 0; i < 100; i++) {
                String firstname = faker.name().firstName();
                int number = faker.number().numberBetween(1,100);
                String lastName = faker.name().lastName();

                String data = "insert into Mitarbeiter(Vorname,Nachname,Position,ApothekeID) values('"+ firstname + "','" + lastName + "','Position" + number+"',"+ number+");";
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
