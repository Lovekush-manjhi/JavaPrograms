// Program is print sum of Odd or Even in given range....?

import java.util.Scanner;
class SumOddOrEven{
	public static void main(String args[]){
		int num, i, sum=0;
		System.out.print("Enter term of range :");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();

		if(num%2 == 0){
			for(i=1; i<=num; i=i+2){
				sum=sum+i;
			}
			System.out.print("Sum of Even number :"+sum);
		}
		else{
			for(i=0; i<=num; i++){ //i=0; i<=num; i=i+2
				if(i%2 == 1){
					sum=sum+i;
				}
			}
			System.out.print("Sum of Odd number :"+sum);
		}
	}
}