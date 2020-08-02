package Group2;

public class FactorialNumber {
    public static void main(String[] args) {

        int n=5;
       int b= factorialNumber(n);

       // System.out.println( factorialNumber(b));
    }
    public static int factorialNumber(int n){
        int result=1;

        for(int i=0;i<=n;i++){
            result=result*i;
        }
        System.out.println(result);
        return result;

    }

}
