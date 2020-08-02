package Group1;

import java.util.Scanner;

/*
7. create a method that can reverse any String
ex: Aras===> sara
    ismail====> liamsi
    Tulpar====> raplut
 */
public class ReverseString_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String str=scan.next();

        String reversed="";

        for(int i=str.length()-1;i>=0;i--){
            String st=""+str.charAt(i);
            if(!reversed.contains(st)){
                reversed+=st;
            }
        }
        System.out.println(reversed);

    }
}
