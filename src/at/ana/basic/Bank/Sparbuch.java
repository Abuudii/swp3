package at.ana.basic.Bank;

public class Sparbuch extends Bank{
    private String id;
    private double Geld;


    public Sparbuch(String hersteller, String kartenname, int kartennummer, String  IBAN, double kontostand) {
        super(hersteller, kartenname, kartennummer, IBAN, kontostand);
    }
}
