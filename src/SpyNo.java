import java.util.Scanner;

public class SpyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        int a = sc.nextInt();
        int s = 0, p = 1;

        int n = a;
        while(n > 0) {
            int d = n % 10;
            s += d;
            p *= d;
            n /= 10;
        }

        if(s == p) {
            System.out.println("The number is spy number");
        } else {
            System.out.println("The number isn't a spy number");
        }

        sc.close();
    }
}
