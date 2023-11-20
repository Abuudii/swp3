package at.ana.basic.Faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TfFaker {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("DE-AT"));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            FileWriter myWriter = new FileWriter("insertDaten.txt");

            for (int i = 0; i < 100; i++) {
                String name = faker.name().fullName();
                String lastName = faker.name().lastName();
                String streetAddress = faker.address().streetAddress();
                String phonenumber =faker.phoneNumber().cellPhone();

                String data = "insert into Apotheken(Name,Adresse,Telefonnummer) values('"+ name + "','" + streetAddress + "','" + phonenumber+"');";
                myWriter.write(data + "\n"); // Append a newline after each set of data
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

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
