package Group2;

import java.util.Arrays;

public class ConcatTwoArray {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={6,7,8,9,10};
        int[] a3=concatTwoArrays(a1,a2);
        System.out.println(Arrays.toString(a3));

    }
    public static int[] concatTwoArrays(int[]arr1,int[]arr2){

        int[]arr3=new int[arr1.length+arr2.length];
            int i=0;

        for (int each:arr1){
            arr3[i]=each;
            i++;
        }
        for(int each:arr2){
            arr3[i]=each;
            i++;
        }

        return arr3;
    }
}
