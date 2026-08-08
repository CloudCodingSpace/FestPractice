import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] a = new float[4][4];
        float[][] b = new float[4][4];
        float[][] mul = new float[4][4];

        System.out.println("Enter the elements of the 4x4 matrix (row wise) :- ");
        for(int r = 0; r < 4; r++) {
            String row = sc.nextLine(); row.trim();
            String[] elements = row.split(" ");
            int i = 0;
            for(int c = 0; c < 4; c++) {
                elements[i] = elements[i].trim();
                while(elements[i].isEmpty()) {
                    i++;
                    elements[i] = elements[i].trim();
                }
                a[r][c] = Float.parseFloat(elements[i]);
                i++;
            }
        }

        System.out.println("Do the same for the other 4x4 matrix :- ");
        for(int r = 0; r < 4; r++) {
            String row = sc.nextLine(); row.trim();
            String[] elements = row.split(" ");
            int i = 0;
            for(int c = 0; c < 4; c++) {
                elements[i] = elements[i].trim();
                while(elements[i].isEmpty()) {
                    i++;
                    elements[i] = elements[i].trim();
                }
                b[r][c] = Float.parseFloat(elements[i]);
                i++;
            }
        }

        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 4; c++) {
                int s = 0;
                for(int i = 0; i < 4; i++) {
                    s += a[r][i] * b[i][c];
                }
                mul[r][c] = s;
            }
        }

        System.out.println("Final matrix after multiplying :- ");
        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 4; c++) {
                System.out.print(mul[r][c] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
