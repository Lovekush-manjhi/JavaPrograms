// Program of maximum between two numbers...?

// input 10 20 -> 20 greatest

import java.util.Scanner;
class MaxBwTwoNum{
	public static void main(String args[]){
		int num1,num2;
		Scanner obj=new Scanner(System.in);

		System.out.print("Enter first number :");
		num1=obj.nextInt();

		System.out.print("Enter second number :");
		num2=obj.nextInt();

		if(num1>num2){
			System.out.print(num1+" is greates number.");
		}
		else if(num1 == num2){
			System.out.print(num1+" is equal to "+num2);
		}
		else{
			System.out.print(num2+" is greates number.");
		}
	}
}