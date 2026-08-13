import java.util.*;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        
        sc.close();
    }
}
