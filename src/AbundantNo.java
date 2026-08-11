import java.util.*;

public class AbundantNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        int a = sc.nextInt();
        int s = 0;

        for(int i = 1; i < a; i++) {
            if((a % i) == 0) {
                s += i;
            }
        }

        if(s > a) {
            System.out.println("The number is a Abundant number");
        } else {
            System.out.println("The number isn't a Abundant number");
        }

        sc.close();
    }
}
