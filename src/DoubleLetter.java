import java.util.*;

public class DoubleLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence :- ");
        String str = sc.nextLine().trim();
        String ls = str.toLowerCase();

        if(str.isEmpty()) {
            System.out.println("The sentence must be valid!");
            System.exit(-1);
        }


        boolean a = false;
        int c = 0, count = 0;
        for(int i = 1; i < ls.length(); i++) {
            if((ls.charAt(i) == ' ')) {
                if(ls.charAt(c) == ls.charAt(i)) {
                    c = i;
                    continue;
                }
            }

            if(ls.charAt(c) == ls.charAt(i) && !a) {
                count++;
                a = true;
            } else {
                a = false;
            }

            c = i;
        }

        System.out.println("No. of pair of consecutive characters in the sentence :- " + count);

        sc.close();
    }
}
