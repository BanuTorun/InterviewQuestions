package Group1;
/*
write a code and find unique from string
     ex:    String str="ABABC";
 */
public class Unique {
    public static void main(String[] args) {
        String str="ABABC"; // "C" is unique

        String result="";

        for(int i=0;i<=str.length()-1;i++){
                char chr=str.charAt(i);
            int count=0;
            for(int j=0;j<=str.length()-1;j++){ // for frequency
                char each=str.charAt(j);
                if(each==chr){
                    count++;

                }


            }
            if(count==1){
                result+=chr;

                System.out.println(result);
            }

        }
    }
}
