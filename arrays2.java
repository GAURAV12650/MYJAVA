package Arrays;

import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.print(" n = ");
        int size =g.nextInt();
        int numbers[] = new int[size];
//input
        for (int i = 0; i < size ; i++) {
            numbers[i]  = g.nextInt();
        }
        int x = g.nextInt();
//output
        for (int i=0; i< numbers.length; i++){
          if (numbers[i] == x){
              System.out.println("x found at index : " +i);}}}}
