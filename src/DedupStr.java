import java.util.Scanner;

public class DedupStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word :- ");
        String str = sc.next().trim();
        String lstr = str.toLowerCase();

        String ss = "";
        int[] table = new int[127];

        for(int i = 0; i < lstr.length(); i++) {
            int idx = lstr.charAt(i);
            if(table[idx] < 1) {
                ss += str.charAt(i);
                table[idx]++;
            }
        }

        System.out.println("Deduplicated string :- " + ss);

        sc.close();
    }
}
