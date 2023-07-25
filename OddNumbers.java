// Program of all Odd numbers in given range....?

import java.util.Scanner;
class OddNumbers{
	public static void main(String args[]){
		int num;
		System.out.print("Enter number of term :");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();

		// for(int i=1; i<=num; i++){
		// 	if(i%2 == 1){
		// 		System.out.print(i+" ");
		// 	}
		// }

		for(int i=1; i<=num; i=i+2){
			System.out.print(i+" ");
		}
	}
}