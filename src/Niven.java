import java.util.*;

public class Niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        int a = sc.nextInt();
        int s = 0;

        int n2 = a;
        while(n2 > 0) {
            int d = n2 % 10;
            s += d;
            n2 /= 10;
        }

        if(a % s == 0) {
            System.out.println("The number is a Niven number");
        } else {
            System.out.println("The number isn't a Niven number");
        }

        sc.close();
    }
}
