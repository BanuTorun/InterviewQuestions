package Group2;

import java.util.Scanner;

public class DivideWithoutOperator {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        divide();

    }


    public static void divide(){
        System.out.println("Please enter the num1: ");
        int a=scan.nextInt();
        System.out.println("Please enter the num2: ");
        int b=scan.nextInt();
        if(b==0){
            System.out.println("Invalid number");

            return;
        }
        System.out.println(a+" divide by "+b+" is");

        int count=0;
        while(a>b){
            a-=b;
            count++;

        }
        System.out.println(count+" and remainder is "+a);
    }
}





