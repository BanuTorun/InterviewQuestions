package Group1;

public class Frequency_2 {
    public static void main(String[] args) {
        String str="OOPQQ";

        String nonDup="";

        for(int i=0;i<=str.length()-1;i++){
            String str1=""+str.charAt(i);
            if(!nonDup.contains(str1)){
                nonDup+=str1;
            }
        }

        String result="";

        for(int j=0;j<=nonDup.length()-1;j++){
            char ch=nonDup.charAt(j);
            int count=0;
            for(int k=0;k<str.length()-1;k++){
                char each=str.charAt(k);
                if(each==ch){
                    count++;
                }
            }
            result+=""+ch+count;
        }
        System.out.println(result);
    }
}
