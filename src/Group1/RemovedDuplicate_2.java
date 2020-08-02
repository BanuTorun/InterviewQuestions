package Group1;
/*
10. write a method that can remove the duplicates from the string
 */
public class RemovedDuplicate_2 {
    public static void main(String[] args) {
        String str="aaaaaabbbbbccccdddeeeeefffghj";

        String result="";

        for(int i=0;i<=str.length()-1;i++){
            String st=""+str.charAt(i);

            if(result.contains(st)){
                continue;
            }else{
                result+=st;
            }
        }
        System.out.println(result);


    }
}
