import java.util.Scanner;
public class Klienci extends Osoba {
    Integer days;
    Klienci(String name, String surname, int age,String document,Integer days) {
        super(name, surname, age, document);
        this.days=days;
    }




    public void BuyAbonament(){
        Scanner scan = new Scanner(System.in);
        Integer dni = 0;
        while(true){
            System.out.println("ile dni chcesz kupic abonament??(jest na 30,90,180,365 dni)");
            dni = scan.nextInt();
            days=dni;
            if(days==30||days==90||days==180||days==365){
                System.out.println("Abonament na "+days+" będzie kosztował: ");
                if(days==30){
                    System.out.println("30zl");
                } else if (days==90) {
                    System.out.println("90zl");
                } else if (days==180) {
                    System.out.println("180zl");
                } else if (days==365) {
                    System.out.println("365 dni");
                }
                break;
            } else if (days!=30&days!=90&days!=180&days!=365) {
                System.out.println("Nieznaleziono takiego abonementu sproboj ponownie");
            }
        }
    }
}