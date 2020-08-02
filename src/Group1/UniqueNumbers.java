package Group1;
/*
write a program and find unique number from array
 */
public class UniqueNumbers {
    public static void main(String[] args) {

        int[]arr={1,1,2,3,3,1}; // unique number is 2

        for(int numbers:arr){

            int count=0;
            for(int each:arr){
                if(each==numbers){
                    count++;
                }
            }

            if(count==1){
                System.out.println(numbers);
            }

        }




    }
}
