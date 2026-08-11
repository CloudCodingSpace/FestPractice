import java.util.*;

public class Pronic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number :- ");
        int a = sc.nextInt();

        boolean b = false;
        for(int i = 0; i < a/2; i++) {
            if(((i + 1) * i) == a) {
                b = true;
                break;
            }
        }

        if(b) {
            System.out.println("The number is a pronic number!");
        } else {
            System.out.println("The number isn't a pronic number!");
        }

        sc.close();
    }
}
