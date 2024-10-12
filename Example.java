package TwoDarrays;

public class Example {
    public static void main(String[] args) {
        int Num[][] = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};
        for (int i = 0; i < Num.length; i++) {
            for (int j=0; j<  Num.length; j++){
                System.out.println(Num[i][j]);
            }
        }
    }
}
