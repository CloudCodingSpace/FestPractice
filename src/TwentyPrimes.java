import java.util.*;

public class TwentyPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a +ve whole number :- ");
        int n = sc.nextInt();

        int i = 1, a = n;
        while(i <= 20) {
            boolean prime = true;
            for(int j = 2; j < a; j++) {
                if((a % j) == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                i++;
                System.out.print(a + " ");
            }
            a++;
        }

        System.out.println();

        sc.close();
    }
}
