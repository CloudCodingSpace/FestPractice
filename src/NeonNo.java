import java.util.Scanner;

public class NeonNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int n2 = n * n;

        int s = 0;
        while(n2 > 0) {
            int d = n2 % 10;
            s += d;
            n2 /= 10;
        }

        if(s == n)
            System.out.println("The given number is a Neon number");
        else
            System.out.println("The given number isn't a Neon number");

        sc.close();
    }
}
