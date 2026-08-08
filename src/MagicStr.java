import java.util.Scanner;

public class MagicStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word :- ");
        String str = sc.next().trim().toLowerCase();
        if(str.isEmpty()) {
            System.err.println("The word must be a valid word dude!!");
            sc.close();
            return;
        }

        boolean a = false;
        char ch = str.charAt(0);
        for(int i = 1; i < str.length(); i++) {
            if((ch + 1) == str.charAt(i)) {
                a = true;
                break;
            }
            ch = str.charAt(i);
        }

        if(a) {
            System.out.println("The word is a magic word!");
        } else {
            System.out.println("The word isn't a magic word!");
        }

        sc.close();
    }
}
