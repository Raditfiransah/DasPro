import java.util.Scanner;
public class teori5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i, n , s = 1, bil = 3;

        System.out.println("Masukkkan n");
        n = input.nextInt();

        for (i = 1;i <= n ; i++) {
            System.out.print(bil+(" "));
            bil +=s;
            s += 2;
        }



    }
}