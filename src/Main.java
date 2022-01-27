import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bankkonto> list = new ArrayList<>();
        boolean avtive  = true;
        while (avtive) {
            list.add(initBankkonto());
            System.out.println(list.get(0));
            System.out.println("Aufhoren?:  ja = j");
            String eingabe = scanner.next();
            if (eingabe.equals("j")){
                avtive = false;
            }
        }
        System.out.println(list.size());
        list.get(1).initKontostandt();
        System.out.println(list.get(1));
    }

    private static Bankkonto initBankkonto() {
        Bankkonto konto = new Bankkonto();
        konto.initName();
        konto.initVorname();
        konto.initKontonummer();
        konto.initKontostandt();
        konto.initLimit();
        return konto;
    }


}
