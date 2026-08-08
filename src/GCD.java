import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 numbers :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while((a % b) != 0) {
            int b2 = b;
            b = a % b;
            a = b2;
        }

        System.out.println("GCD of the numbers is :- " + b);

        sc.close();
    }
}
