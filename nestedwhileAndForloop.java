package Loops;

public class nestedwhileAndForloop {
    public static void main(String[] args) {
        int weeks =3;
        int days=7;
        int i=1;
        //outer loop
        while (i<=weeks){
            System.out.println("weeks"+i);
            //inner loop
            for (int j=1; j<=days; j++){
                System.out.println(" days: " +j);
            }
            ++i;
        }
    }
}
