package Group2;

public class ArrayMinNum {
    public static void main(String[] args) {

        int[]a={3,-5,9,1,0};
         minValue(a);
         //int b=minValue(a);
        //System.out.println(b);

    }
    public static int minValue(int[] a){
        int min=Integer.MAX_VALUE;


        for(int each:a){
            if(each<min){
                min=each;
            }
        }
        System.out.println("Min: "+min);
        return min;
    }
}
