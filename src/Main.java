import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // create variables
        double sabit = 10,km = 2.20,yol,sonuc,sonuc1;

        // create scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km yol gidilecek?: ");
        yol = input.nextDouble();

        // condition and calculation
        sonuc = sabit + km * yol;
        sonuc1 = (sonuc < 20) ? 20 : sonuc;

        // output
        System.out.println(sonuc1);
    }
}
