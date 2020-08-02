package Group2;
/*
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
 */
public class DivisibleBy_3_5_15 {
    public static void main(String[] args) {

        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";


       // List<Integer> list = new ArrayList<Integer>();

       // for(int i=0; i < 100; i++)

         //   list.add(i+1);

        int[]arr=new int[100];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=i+1;
        }
        for(int each: arr){
            if(each%15==0 && each%3==0){
                divisibleBy15+=each+" ";
            }
            if(each%3==0 && each%15!=0){
                divisibleBy3+=each+" ";
            }
            if(each%5==0 && each%15!=0){
                divisibleBy5+=each+" ";
            }

        }
        System.out.println("Divisible By 15: "+divisibleBy15);

        System.out.println("Divisible By 5: "+divisibleBy5);

        System.out.println("Divisible By 3: "+divisibleBy3);
    }
}
