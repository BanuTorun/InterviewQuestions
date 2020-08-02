package Group1;

public class Frequency_1 {
    public static void main(String[] args) {
        String str="AAAABBBBCCCCDEEEEEFFFFGGGFGHHHH";

        String nonDup="";
        for(int i=0;i<=str.length()-1;i++){
            String s=""+str.charAt(i);
            if(!nonDup.contains(s)){
                nonDup+=s;
            }
            //System.out.println(nonDup);
        }
        String result="";
        for(int j=0;j<=nonDup.length()-1;j++){
            char ch= nonDup.charAt(j);
            int count=0;
            for(int k=0;k<=str.length()-1;k++){
                char each=str.charAt(k);
                if(each==ch){
                    count+=1;
                }
            }

            result+=""+ch+count;
        }
        System.out.println(result);
    }
}
