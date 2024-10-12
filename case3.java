package methods;

class BB{
    void Demofunction(double j){
        if (j<9)
            return;
        ++j;}}
public class case3 {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.Demofunction(5.5);
        System.out.println("Programm Executed Successfully");
    }
}
