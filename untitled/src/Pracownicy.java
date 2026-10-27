import java.util.Scanner;

public class Pracownicy extends Osoba {
    Integer Salary;
    Integer hoursWorkd;

    Pracownicy(Integer Salary, int hoursWorkd,String name, String surname, int age, String document) {
        super(name, surname, age, document);
        this.Salary = Salary;
        this.hoursWorkd = hoursWorkd;
    }

    public void PlanOnTheWeek() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Ile w tym miesiącu godzin masz do zrobienia?");
            hoursWorkd = scan.nextInt();
            if (hoursWorkd <= 184 && hoursWorkd >= 1) {
                System.out.println("W tym miesiącu masz do zarobienia: " + hoursWorkd * 45+"zł");
                break;
            } else {
                System.out.println("Nie możesz pracować więcej niż 184 godzin w miesiącu w Polsce, wprowadź mniej godzin!");
            }
        }
//        String job;
//        System.out.println("Kim jesteś w systemie?");
//        job = scan.nextLine();

//        if (job == "sprzątaczka" || job == "Sprzątaczka" || job == "sprzątacz" || job == "Sprzątacz") {
//            while (true) {
//                System.out.println("Ile w tym miesiącu godzin masz do zrobienia?");
//                hoursWorkd = scan.nextInt();
//                if (hoursWorkd <= 184 && hoursWorkd >= 1) {
//                    System.out.println("W tym miesiącu masz do zarobienia: " + hoursWorkd * 45);
//                    break;
//                } else {
//                    System.out.println("Nie możesz pracować więcej niż 184 godzin w miesiącu w Polsce, wprowadź mniej godzin!");
//                }
//            }
//        }
//        if (job == "Sekretariat" || job == "sekretariat" || job == "Sekretariatka" || job == "sekretariatka") {
//            while (true) {
//                System.out.println("Ile godzin w tym miesiącu masz do zrobienia?");
//                hoursWorkd = scan.nextInt();
//                if (hoursWorkd <= 184 && hoursWorkd >= 1) {
//                    System.out.println("W tym miesiącu masz do zarobienia: " + hoursWorkd * 60);
//                    break;
//                } else {
//                    System.out.println("Nie możesz pracować więcej niż 184 godzin w miesiącu w Polsce, wprowadź mniej godzin!");
//                }
//            }
//        }
//        if (job == "Elektryk" || job == "elektryk") {
//            while (true) {
//                System.out.println("Ile godzin w tym miesiącu masz do zrobienia?");
//                hoursWorkd = scan.nextInt();
//                if (hoursWorkd <= 184 && hoursWorkd >= 1) {
//                    System.out.println("W tym miesiącu masz do zarobienia: " + hoursWorkd * 70);
//                    break;
//                } else {
//                    System.out.println("Nie możesz pracować więcej niż 184 godzin w miesiącu w Polsce, wprowadź mniej godzin!");
//                }
//            }
//        }
    }
}