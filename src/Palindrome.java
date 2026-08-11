import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        String a = String.valueOf(sc.nextInt());

        StringBuilder b = new StringBuilder(a);
        b.reverse();

        if(a.equals(b.toString())) {
            System.out.println("The number is a palindrome number!");
        } else {
            System.out.println("The number isn't a palindrome number!");
        }

        sc.close();
    }
}
