import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        System.out.println('sigma');

         int liczba= (int)(Math.random()*100);
        System.out.println(liczba);

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj twoj numer: ");
        int sigma=klawiatura.nextInt();

        if(sigma==liczba){
            System.out.println("Twoj numer w kolejce to: "+ liczba);
        }else{
            System.out.println("Zapisz sie do kolejki");
        }



    }
}
