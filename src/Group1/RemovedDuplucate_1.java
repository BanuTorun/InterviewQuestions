package Group1;

import java.util.Scanner;

/*
write a programme that you find word duplicate
ex: nalan===> nalan
    level====> level
    efe======>efe
    ege=======>ege
    "bbbbbaaaannnnuuuu"
 */
public class RemovedDuplucate_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String str=scan.next();

        String removedDup="";
        for(int i=0;i<=str.length()-1;i++){
            String st=""+str.charAt(i);
            if (!removedDup.contains(st)) {
                removedDup+=st;

            }

        }
        System.out.println(removedDup);


    }

}
