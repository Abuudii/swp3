package at.ana.basic.Bank;

public class Girokonto extends Bank{
    public Girokonto(String hersteller, String kartenname, int kartennummer, String IBAN, double kontostand) {
        super(hersteller, kartenname, kartennummer, IBAN, kontostand);
    }
}
