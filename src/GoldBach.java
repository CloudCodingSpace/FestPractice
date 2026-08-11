import java.util.*;

public class GoldBach  {
    public static boolean isPrime(int n) {
        if(n == 2)
            return true;
        if(n <= 1)
            return false;

        for(int i = 2; i < n; i++) {
            if((n % i) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a whole number :- ");
        int n = sc.nextInt();

        boolean a = false;
        for(int i = 0; i < n; i++) {
            int j = n - i;
            if(isPrime(j) && isPrime(i) && (i != 2) && (j != 2)) {
                a = true;
                break;
            }
        }

        if(a) {
            System.out.println("The no. is a gold bach number!"); 
        } else {
            System.out.println("The no isn't a gold bach number!");
        }

        sc.close();
    }
}
