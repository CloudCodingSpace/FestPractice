import java.util.*;

public class FloydTri {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int a = 1;

        System.out.println("Floyd's triangle :- ");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

        sc.close();
    }
}
