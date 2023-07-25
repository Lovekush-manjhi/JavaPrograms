// Program to print ASCII value of a character....?

// input A(character) -> 65(ASCII or integerValue)

import java.util.Scanner;
class CharToASCII{
	public static void main(String args[]){
		char ch;
		System.out.print("Enter any character :");
		Scanner obj=new Scanner(System.in);
		ch=obj.next().charAt(0);

		int a=ch;
		System.out.print("ASCII of "+ch+" is: "+a);
	}
}