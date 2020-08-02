package Group2;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[]arr={1,4,3,2,5};// {1,2,3,4,5}
        Arrays.sort(arr);    //  {5,4,3,2,1}
         int[]arr2=new int[arr.length];
/*           i      k
        arr2[0]=arr[arr.length-1]; //5
        arr2[1]=arr[3]; //4
        arr2[2]=arr[2]; //3
        arr2[3]=arr[1]; //3
        arr[arr2.length-1]=arr[0];//3
 */
         int k=arr.length-1;

         for(int i=0;i<=arr2.length-1;i++){
              arr2 [i]=arr[k];

              k--;

         }
        System.out.println(Arrays.toString(arr2));
    }
}
