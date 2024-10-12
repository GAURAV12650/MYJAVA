package PatternQuestion;

import java.util.Scanner;

public class SolidRectangel {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Row n = ");
        int n = sc.nextInt();
        System.out.print("Enter the Column m = ");
        int m= sc.nextInt();



        for (int i =0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
