package at.ana.basic.Faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class TfFaker3 {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("DE-AT"));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            FileWriter myWriter = new FileWriter("insertDaten3.txt");

            for (int i = 0; i < 100; i++) {
                Date currentDate = new Date();
                int number = faker.number().numberBetween(1,100);

                String data = "insert into Bestellungen(Datum,ApothekeID) values('"+  formatter.format(currentDate)+ "','" + number + "');";
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
