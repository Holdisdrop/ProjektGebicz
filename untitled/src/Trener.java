import java.util.Scanner;
public class Trener extends Osoba{
    int personal_trainig=0;
    int open_trainig=0;
    int ptrn_price=25;
    int otrn_price=10;
    int pensja=0;

    Trener(String name, String surname, int age, String document){
        super(name,surname,age,document);
    }

    public void Add_trainigs(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilość treningów personalnych w tym tygodniu: ");
        personal_trainig = scan.nextInt();
        System.out.println("Ilość treningów grupowych w tym tygodniu: ");
        open_trainig = scan.nextInt();
    }

    public void Planned_trainigs(){
        System.out.println("Zaplanowanych treningów personalnych: "+personal_trainig);
        System.out.println("Zaplanowanych treningów grupowych: "+open_trainig);
    }

    public void Payment(){
        pensja=(personal_trainig*ptrn_price)+(open_trainig*otrn_price);
        System.out.println("Pensja za bieżący tydzień: "+pensja);
    }
}