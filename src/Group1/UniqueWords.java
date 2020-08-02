package Group1;

public class UniqueWords {
    public static void main(String[] args) {

        String[] words = { "C#", "C#", "Python", "Python", "Java", "C++", "Ruby"};


        for(String arr:words){
            int count=0;
            for(String each:words){
                if(each.equals(arr)){
                    count++;
                }
            }
            if(count==1){

                System.out.println(arr);
            }

        }

    }
}
