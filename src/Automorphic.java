import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        int n = sc.nextInt();

        String nStr = String.valueOf(n);
        String n2Str = String.valueOf(n*n);

        boolean a = nStr.equals(n2Str.substring(n2Str.length() - nStr.length()));
        if(a)
            System.out.println("The number is a automorphic number");
        else
            System.out.println("The number isn't a automorphic number");

        sc.close();
    }
}
