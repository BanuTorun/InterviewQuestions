package Group1;
/*
find unique elements from arrays
 */
public class UniqueElements_1 {
    public static void main(String[] args) {

        String[]arr={"A", "B", "B", "C",};

        for(String elements:arr){
            int count=0;
            for(String each:arr){
                if(elements.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(elements);
            }

        }

    }
}
