import java.util.Scanner;

public class ShortenName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name :- ");
        String name = sc.nextLine();
        String lname = name.toLowerCase();

        if(name.trim().isEmpty()) {
            System.err.println("YOu must have a name man!!");
            sc.close();
            return;
        }

        String str = "";
        int m = name.lastIndexOf(" ");
        String sname = name.substring(m);
        if(m != (name.length() - 1))
            sname = name.substring(m+1);

        boolean b = false;
        for(int i = 0; i < m; i++) {
            if((lname.charAt(i) <= 'z') && (lname.charAt(i) >= 'a')) {
                if(b) {
                    continue;
                }
                str += (char)('A' + (lname.charAt(i) - 'a')) + ". ";
                b = true;
            } else {
                b = false;
            }
        }

        System.out.println(str + sname);

        sc.close();
    }
}
