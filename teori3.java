import java.util.Scanner;
public class teori3{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i, n;

        System.out.println("Masukkkan angka");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print((i*i) +" ");
            
        }



    }
}