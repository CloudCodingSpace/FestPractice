import java.util.Scanner;

public class Special00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a two digit number :- ");
        int a = sc.nextInt();
        int n = a;
        int s = 0, p = 1;

        for(int i = 0; i < 2; i++) {
            int d = n % 10;
            s += d;
            p *= d;
            n /= 10;
        }

        if(n != 0 || a == 0) {
            System.out.println("The number isnt two digit! aborting idiot!");
            System.exit(1);
        }

        if(a == (s + p)) {
            System.out.println("Special two-digit number");
        } else {
            System.out.println("Not a Special two-digit number");
        }

        sc.close();
    }
}
