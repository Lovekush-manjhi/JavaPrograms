// Program of add two numbers by user input...?

import java.util.Scanner;

class AddUserInput{
    public static void main(String args[]){
        int num1, num2, result;
        Scanner obj = new Scanner(System.in);
        System.out.print("Emter first number :");
        num1 = obj.nextInt();

        System.out.print("Emter second number :");
        num2 = obj.nextInt();

        result = num1+num2;
        System.out.print("Add of numbers :"+result);
    }
}