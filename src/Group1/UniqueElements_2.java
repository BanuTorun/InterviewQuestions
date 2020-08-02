package Group1;

public class UniqueElements_2 {
    public static void main(String[] args) {

        String[]arr={"A", "B", "B", "C",};

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int k=0;k<=arr.length-1;k++){
                if(arr[i].equals(arr[k])){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}
