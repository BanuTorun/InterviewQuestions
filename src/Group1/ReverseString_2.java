package Group1;

public class ReverseString_2 {
    public static void main(String[] args) {
       String str="I love my family";

        String result="";
        for(int i=str.length()-1; i>=0;i--){
            result+=str.charAt(i);
        }
        System.out.println(result);

    }
}
