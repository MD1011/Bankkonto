import java.util.Scanner;

public class Bankkonto {


    private String name;
    private String vorname;
    private int kontonummer;
    private double kontostandt;
    private double limit;



    public Bankkonto(){

    }

    Scanner scan = new Scanner(System.in);


    public String initName() {
        System.out.println("Bitte den Namen eingeben:");
        name = scan.next();
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String initVorname() {
        System.out.println("Bitte den Vornamen eingeben: ");
        vorname = scan.next();
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }


    public int initKontonummer() {
        System.out.println("Bitte die Kontonummer eingeben: ");
        kontonummer = scan.nextInt();
        return kontonummer;
    }
    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }


    public double initKontostandt() {
        System.out.println("Bitte den Kontostadt eingeben: ");
        kontostandt = scan.nextDouble();
        return kontostandt;
    }
    public void setKontostandt(double kontostandt) {
        this.kontostandt = kontostandt;
    }


    public double initLimit() {
        System.out.println("Bitte das Limit eingeben: ");
        limit = scan.nextDouble();
        return limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Vorname: " + vorname + "\n" +
                "Kontonummer: " + kontonummer + "\n" +
                "Kontostandt: " + kontostandt + "\n" +
                "Limit: " + limit;
    }


}





