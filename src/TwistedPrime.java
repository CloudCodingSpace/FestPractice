import java.util.*;

public class TwistedPrime {
    public static boolean isPrime(int a) {
        if(a == 2)
            return true;
        if(a <= 1) {
            return false;
        }

        for(int i = 2; i < a; i++) {
            if((a % i) == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        String a = String.valueOf(sc.nextInt());
        String b = (new StringBuilder(a)).reverse().toString();

        if(isPrime(Integer.parseInt(a)) && isPrime(Integer.parseInt(b))) {
            System.out.println("The number is twisted prime!");
        } else {
            System.out.println("The number isn't a twisted prime!");
        }

        sc.close();
    }
}
