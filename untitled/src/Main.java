
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        bzd baza = new bzd();

        System.out.println("SYSTEM SILOWNI");
        System.out.println("Podaj swoj PESEL:");
        String pesel = scan.nextLine();

        boolean znaleziono = false;

        for (int i = 0; i < baza.TrenerPesel.length; i++) {
            if (pesel.equals(baza.TrenerPesel[i])) {
                System.out.println("Zalogowano jako Trener");
                Trener t = new Trener("", "", 0, pesel);
                t.Add_trainigs();
                t.Planned_trainigs();
                t.Payment();
                znaleziono = true;

            }
        }

        if (!znaleziono) {
            for (int i = 0; i < baza.KlientPesel.length; i++) {
                if (pesel.equals(baza.KlientPesel[i])) {
                    System.out.println("Zalogowano jako Klient");
                    Klienci k = new Klienci("", "", 0, pesel, 0);
                    k.BuyAbonament();
                    znaleziono = true;
                }
            }
        }

        if (!znaleziono) {
            for (int i = 0; i < baza.PracownikPesel.length; i++) {
                if (pesel.equals(baza.PracownikPesel[i])) {
                    System.out.println("Zalogowano jako Pracownik");
                    System.out.println("Witaj w systemie pracowniczym");
                    znaleziono = true;
                }
            }
        }

        if (!znaleziono) {
            System.out.println("Blad logowania nie znaleziono PESELU w bazie");
        }

    }
}
