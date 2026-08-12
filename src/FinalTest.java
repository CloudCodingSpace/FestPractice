import java.util.*;

public class FinalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Automorphic
        /*
        System.out.println("Enter a number :- ");
        int a = sc.nextInt();

        String s = String.valueOf(a);
        String s2 = String.valueOf(a * a);

        if(s.equals(s2.substring(s2.length() - s.length()))) {
            System.out.println("The number is automorhpic number");
        } else {
            System.out.println("The number isn't a automorphic number!");
        }
        */

        // Shorten name
        /*
        System.out.println("Enter your name (full name) :-");
        String name = sc.nextLine().trim();

        if(name.isEmpty()) {
            System.out.println("You must enter a name!");
            System.exit(-1);
        }

        int idx = name.lastIndexOf(" ");
        
        if(idx == -1) {
             System.out.println("You are supposed to enter the full name!");
             System.exit(-1);
        }

        String sname = name.substring(idx).trim();

        if(sname.isEmpty() || name.substring(0, idx).isEmpty()) {
            System.out.println("You are supposed to enter the full name!");
            System.exit(-1);
        }

        String fname = name.substring(0, idx).toLowerCase();
        String ss = "";
        boolean a = false;
        for(int i = 0; i < fname.length(); i++) {
            if((fname.charAt(i) <= 'z') && (fname.charAt(i) >= 'a')) {
                if(a) {
                    continue;
                }
                a = true;
                ss += (char)('A' + (fname.charAt(i) - 'a')) + ". ";
            } else {
                a = false;
            }
        }

        System.out.println("Shortened name :- " + ss + sname);
        */

        // Palindrom
        /*
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
        */

        // Inserting an element
        /*
        int[] arr = new int[9];
        int[] newArr = new int[10];

        System.out.println("Enter 9 numbers :- ");
        for(int i = 0; i < 9; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the number you want to insert :- ");
        int n = sc.nextInt();

        System.out.println("Enter the position where you want to insert it in the array :- ");
        int idx = sc.nextInt() - 1;

        if(idx < 0 || idx > 9) {
            System.out.println("The position you entered where you wanna insert is outta bounds!");
            System.exit(-1);
        }

        int j = 0;
        for(int i = 0; i < 10; i++) {
            if(i == idx) {
                newArr[i] = n;
                continue;
            }
            newArr[i] = arr[j];
            j++;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        */

        // Double letter
        /*
        System.out.println("Enter a sentence :- ");
        String str = sc.nextLine().trim();

        if(str.isEmpty()) {
            System.out.println("You have to enter a sentence!");
            sc.close();
            return;
        }

        String ls = str.toLowerCase();

        boolean a = false;
        int c = 0, ch = 0;
        for(int i = 1; i < ls.length(); i++) {
            if(ls.charAt(i) == ' ')
                continue;
            
            if(ls.charAt(i) == ls.charAt(ch) && !a) {
                c++;
                a = true;
            } else {
                a = false;
            }
            ch = i;
        }

        System.out.println("The number of double letters are " + c);
        */

        // Word sentence
        System.out.println("Enter a sentence :- ");
        String s = sc.nextLine().trim();

        if(s.isEmpty()) {
            System.out.println("You must enter a sentence!");
            sc.close();
            return;
        }

        String ls = s.toLowerCase();

        boolean a = false;
        int c = 1;
        for(int i = 0; i < ls.length(); i++) {
            if((ls.charAt(i) > 'z') || (ls.charAt(i) < 'a')) {
                if(a)
                    continue;
                a = true;
                c++;
            } else {
                a = false;
            }
        }

        String[] words = new String[c];
        a = false;
        c = 0;
        int idx = 0;

        for(int i = 0; i < ls.length(); i++) {
            if((ls.charAt(i) > 'z') || (ls.charAt(i) < 'a')) {
                if(a)
                    continue;
                a = true;
                words[c] = s.substring(idx, i);
                idx = i + 1;
                c++;
            } else {
                a = false;
            }
        }

        if((ls.charAt(ls.length() - 1) <= 'z') && (ls.charAt(ls.length() - 1) >= 'a'))
            words[c++] = s.substring(idx, s.length());

        System.out.println("All the words in the sentence :- ");
        for(int i = 0; i < c; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}
