package PatternQuestion;

import java.util.Scanner;

public class continueNumPy {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Enter the num n= ");
        int n = g.nextInt();
        System.out.println("Enter the num m = ");
        int number =g.nextInt();
        for (int i =1; i<=n; i++){
            for (int j= 1; j<=i; j++){
                System.out.print(number+" ");
                number++;}
            System.out.println();}}}
