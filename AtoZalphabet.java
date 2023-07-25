// Program of print A to Z alphabets...?

// input ending point: Z -> A,B,C,D..Z

import java.util.Scanner;
class AtoZalphabet{
	public static void main(String args[]){
		char i,term;
		System.out.print("Enter a ending character :");
		Scanner obj=new Scanner(System.in);
		term=obj.next().charAt(0);

		for(i='A'; i<=term; i++){
			System.out.print(i+" ");
		}
	}
}