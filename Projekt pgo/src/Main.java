// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = Scanner.nextInt();
        if (number == 0){
            System.out.println("The value is iquals 0");
        }
        else if (number > 0){
            System.out.println ("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}