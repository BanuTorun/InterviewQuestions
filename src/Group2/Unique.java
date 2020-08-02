package Group2;

public class Unique {
    public static void main(String[] args) {

        String str="AAABBBCCCDDEEF";

        String unique="";

        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);

            int num=0;
            for(int j=0;j<=str.length()-1;j++){
                char c=str.charAt(j);

                if(ch==c){
                    num++;
                }
            }
            if(num==1){
                unique+=ch;
                System.out.println(unique);
            }
        }
    }
}
