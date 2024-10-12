package methods;

//method2
// main driver method
public class case1 {
    public static void main(String[] args) {
        //print statement
        System.out.println(new GFG().RR(5.5, 6.5));
    }
}
class GFG{
    //method1
    //since return type of RR method is double
    // return value;
   double RR(double a, double b){

        double sum=0;
        sum =(a+b)/2.0;
        return sum;
    }

}