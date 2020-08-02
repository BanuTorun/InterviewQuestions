package Group2;

public class OddEvenNum {
    public static void main(String[] args) {

        int n=3;
        System.out.println(identifyOddEven(n));


    }
    public static String identifyOddEven(int n){

        return n%2==0 ? "Even":"Odd";
    }
}
