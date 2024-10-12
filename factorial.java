package Function;

import java.util.Scanner;

public class factorial {
    public static void printFact(int n){
        if (n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial =1;
        for (int i =n; i>=1; i-- ){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Enter the number n = ");
        int n = g.nextInt();

        printFact(n);}}
