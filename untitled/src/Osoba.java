import java.util.Scanner;
public class Osoba {
    String name;
    String surname;
    int age;
    String document;

    Osoba(String name, String surname, int age, String document) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.document = document;
    }

    public void Login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź imie");
        String imie = scan.nextLine();
        name = imie;
        System.out.println("Wprowadź nazwisko");
        String nazwisko = scan.nextLine();
        surname = nazwisko;
        System.out.println("Wprowadź wiek");
        Integer wiek = scan.nextInt();
        age = wiek;
        System.out.println("Wprowadź pesel");
        String pesel = scan.nextLine();
        document = pesel;

        System.out.println("Imie:" + name + " Nazwisko:" + surname + " Wiek:" + age + " Pesel:" + document);
    }
}


//        void Pokaz(){
//            Dane();
//        }

