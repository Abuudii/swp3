package at.ana.basic.Bank;

public class Bank {
    private String Hersteller;
    private String Kartenname;
    private int Kartennummer;
    private String IBAN;
    private double Kontostand;

    public void Einzahlen(double Einzahl){
        System.out.println("Es wurde " + Einzahl +"€ eingezahlt");
        double NeuKontostand = getKontostand() + Einzahl;
        setKontostand(NeuKontostand);
    }

    public void Auszahlen(double Auszahl){
        System.out.println("Es wurde " + Auszahl +"€ ausgezahlt");
        double NeuKontostand = getKontostand() - Auszahl;
        setKontostand(NeuKontostand);
    }

    public void Saldo(){
        System.out.println("Der Saldo beträgt: " + getKontostand());
    }


    public Bank(String hersteller, String kartenname, int kartennummer, String IBAN, double kontostand) {
        this.Hersteller = hersteller;
        this.Kartenname = kartenname;
        this.Kartennummer = kartennummer;
        this.IBAN = IBAN;
        this.Kontostand = kontostand;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public String getKartenname() {
        return Kartenname;
    }

    public void setKartenname(String kartenname) {
        Kartenname = kartenname;
    }

    public int getKartennummer() {
        return Kartennummer;
    }

    public void setKartennummer(int kartennummer) {
        Kartennummer = kartennummer;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getKontostand() {
        return Kontostand;
    }

    public void setKontostand(double kontostand) {
        Kontostand = kontostand;
    }
}
