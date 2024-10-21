import java.util.Scanner;
public class teori8{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i, bil1, bil2, hasil = 0;

        System.out.println("Masukkkan angka");
        bil1 = input.nextInt();

        System.out.println("Masukkkan angka");
        bil2 = input.nextInt();

        for (i = 1; i <= bil1; i++) {
            hasil += bil2;
            
        }
        System.out.print("hasil dari "+ bil1 + " * "+ bil2 + " = "+ hasil);



    }
}