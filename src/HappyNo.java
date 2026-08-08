import java.util.Scanner;

public class HappyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        int s = n;
        while(s >= 10) {
            int a = s;
            s = 0;
            while(a > 0) {
                int d = a % 10;
                s += d * d;
                a /= 10;
            }
        }

        if(s == 1)
            System.out.println("The no. is a happy number!");
        else
            System.out.println("The no. isn't a happy number!");

        sc.close();
    }
}
