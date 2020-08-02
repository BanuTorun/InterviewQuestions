package Group2;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str="AABBCCDDEE";
        String result="";

        for(int i=0;i<=str.length()-1;i++){
            String st=""+str.charAt(i);
             if(!result.contains(st)){
                 result+=st;
             }
        }
        System.out.println(result);



        }
    }

