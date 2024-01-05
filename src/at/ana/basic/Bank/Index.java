package at.ana.basic.Bank;

public class Index {
    public static void main(String[] args) {

        Bank b1 = new Bank("Reifeisen", "Abud", 9333232,"AT478438723487", 5090 );
        b1.Einzahlen(1200);
        b1.Auszahlen(200);
        b1.Saldo();

    }

    Sparbuch S1 = new Sparbuch("Reifeisen", "Abud", 9333232,"AT478438723487", 5090 );

    Girokonto G1 = new Girokonto("Reifeisen", "Abud", 9333232,"AT478438723487", 5090 );

    Kreditkonto K1 = new Kreditkonto("Reifeisen", "Abud", 9333232,"AT478438723487", 5090 );
}
