package at.ana.basic.Bank;

public class Kreditkonto extends Bank{
    public Kreditkonto(String hersteller, String kartenname, int kartennummer, String IBAN, double kontostand) {
        super(hersteller, kartenname, kartennummer, IBAN, kontostand);
    }
}
