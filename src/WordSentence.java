import java.util.*;

public class WordSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :- ");
        String str = sc.nextLine().trim();
        String ls = str.toLowerCase();

        if(ls.isEmpty()) {
            System.out.println("The sentence must be provided!");
            System.exit(-1);
        }

        int c = 1, i = 0, l = 0;
        boolean a = false;
        for(i = 0; i < ls.length(); i++) {
            if((ls.charAt(i) > 'z') || (ls.charAt(i) < 'a')) {
                if(a) {
                    continue;
                }
                a = true;
                c++;
            } else {
                a = false;
                l++;
            }
        }

        System.out.println("No. of words in sentence :- " + c);
        System.out.println("No. of letters in sentence :- " + l);

        sc.close();
    }
}
