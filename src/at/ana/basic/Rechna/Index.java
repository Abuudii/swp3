package at.ana.basic.Rechna;

public class Index {
    public static void main(String[] args) {
        Rechner R1= new Rechner();
        R1.Summe(2,2);
        R1.Differenz(5,1);
        R1.Produkt(3,6);
        R1.Quotient(4,2);

        Wissenschaft W1= new Wissenschaft();
        W1.Sinus(90);
        W1.Cosinus(5);

        Wurzel Wu1=new Wurzel();
        Wu1.Wurzel(25);
    }
}
