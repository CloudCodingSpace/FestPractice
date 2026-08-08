import java.util.*;

public class Piglatin {
    public static boolean isVowel(String ls, int i) {
        return ls.charAt(i) == 'a' || ls.charAt(i) == 'e' || ls.charAt(i) == 'i' || ls.charAt(i) == 'o' || ls.charAt(i) == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word (in upper case) :- ");
        String s = sc.next().trim().toUpperCase();
        String ls = s.toLowerCase();

        StringBuilder sb = new StringBuilder(s);
        
        if(isVowel(ls, 0)) {
            sb.append("WAY");
        } else {
            int idx = 0;
            boolean hasVowel = false;
            for(int i = 0; i < ls.length(); i++) {
                if(isVowel(ls, i)) {
                    hasVowel = true;
                    idx = i;
                    break;
                }
            }

            if(hasVowel) {
                String ss = sb.substring(0, idx);
                sb.delete(0, idx);
                sb.append(ss + "AY");
            } else {
                sb.reverse();
            }
        }
       
        System.out.println("The Piglatin string :- " + sb.toString());

        sc.close();
    }
}
