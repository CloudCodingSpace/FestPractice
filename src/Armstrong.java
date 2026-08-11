import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        int a = sc.nextInt();

        int s = 0;
        String as = String.valueOf(a);
        for(int i = 0; i < as.length(); i++) {
            int n = as.charAt(i) - '0';
            s += Math.pow(n, as.length());
        }

        if(s == a) {
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number isn't a Armstrong number");
        }

        sc.close();
    }
}
