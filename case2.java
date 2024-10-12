package methods;
//method1 -> Engein;
class AAA{
    void demoSum(int a,int b){
        int sum = 0;
        sum=(a+b)/10;
        System.out.println(sum);
        //no return statement because void is use.
    }
}
//method2 -> driver method
public class case2 {
    public static void main(String[] args) {
        new AAA().demoSum(5,5);
        System.out.println("No Return Keyword is used and program exected succeddfully");
    }
}
