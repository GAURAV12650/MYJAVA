package PatternQuestion;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Row = ");
        int n = s.nextInt();
        for (int i=0; i<=n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
