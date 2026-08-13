import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Using stringbuilder
        System.out.println("Enter a number :- ");
        String a = String.valueOf(sc.nextInt());

        StringBuilder b = new StringBuilder(a);
        b.reverse();

        if(a.equals(b.toString())) {
            System.out.println("The number is a palindrome number!");
        } else {
            System.out.println("The number isn't a palindrome number!");
        }
        */

        // By my own method which I derived (not claiming to be original though)
        System.out.println("Enter a number :- ");
        String a = sc.nextLine().trim();

        if(a.isEmpty()) {
            System.out.println("You must enter a number!");
            System.exit(-1);
        }

        boolean b = true;
        int j = a.length() - 1;
        for(int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(j)) {
                b = false;
                break;
            }
            j--;
        }

        if(b) {
            System.out.println("Input is a palinedrome!");
        } else {
            System.out.println("Input isn't a palinedrome!");
        }

        sc.close();
    }
}
