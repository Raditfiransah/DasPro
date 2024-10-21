import java.util.Scanner;
public class teori2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i, n ,jum = 1;

        System.out.println("Masukkkan n");
        n = input.nextInt();

        for (i = 1;i <= n ; i++) {
            jum *= i;
            System.out.print(jum+(" "));
        }



    }
}