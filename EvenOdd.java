// Program of find to number is Even or Odd...?

import java.util.Scanner;

class EvenOdd{

    public static void main(String args[]){
        int num;
        System.out.print("Enter a number :");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();

        if(num%2 == 0){
            System.out.print("Number is even.");
        }
        else{
            System.out.print("Number is odd.");
        }

    }
}