import java.util.Scanner;

public class ShortenName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        sc.close();
    }
}
