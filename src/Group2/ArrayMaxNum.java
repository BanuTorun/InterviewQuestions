package Group2;

public class ArrayMaxNum {
    public static void main(String[] args) {

        int[]n={30,60,4,57};
        int a=maxValue(n);
        System.out.println(a);
    }
    public static int maxValue(int[] n){

        int max=Integer.MIN_VALUE;

        for(int each:n){
            if(each>max){
                max=each;
            }
        }
        //System.out.println("Max: "+max);
        return max;
    }
}
