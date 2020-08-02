package Group1;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str=" dog dog dog cat cat cat Dog Dog Dog ".toLowerCase();

        int dogOfCount=0;
        while(str.contains("dog")){
            dogOfCount++;
            str=str.replaceFirst("dog","");

        }
        int catOfCount=0;
        while(str.contains("cat")){
            catOfCount++;
            str=str.replaceFirst("cat","");

        }

        System.out.println("The dog: "+dogOfCount);
        System.out.println("The cat: "+catOfCount);
    }
}
