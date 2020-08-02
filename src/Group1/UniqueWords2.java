package Group1;

public class UniqueWords2 {
    public static void main(String[] args) {
        String[] words = { "C#", "C#", "Python", "Python", "Java", "C++", "Ruby"};

        String result="";

        for(int i=0;i<=words.length-1;i++){
            int count=0;
            for(int j=0;j<=words.length-1;j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            if(count==1){
                System.out.println(words[i]);
            }
        }
    }
}
