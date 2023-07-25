// Program is find to factorial of number using recursion...?

import java.util.Scanner;
public class FactRecursion{
	public static int rec(int n){
		if(n<=1){
			return 1;
		}
		else{
			return n*rec(n-1);
		}
	}
	public static void main(String args[]){
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number :");
		num=obj.nextInt();
		System.out.print("Recursion of number: "+rec(num));
	}
}