public class Patterns {
    public static void main(String[] args) {
        int a = 5, b = 0;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= a; j++) {
                System.out.print(j);
            }
            for(int j = 1; j <= b; j++) {
                System.out.print(" ");
            }
            for(int j = a; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            a -= 1;
            b += 2;
        }
    }
}
