// Program of calculate power of number....?

// input num=5
// power=3
// 5*5*5=125


import java.util.Scanner;
class PowerOfNum{
	public static void main(String args[]){
		int num,pow,result=1;
		System.out.print("Enter a number :");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();

		System.out.print("Enter power of number :");
		pow=obj.nextInt();

		for(int i=1; i<=pow; i++){
			result=num*result;
		}
		System.out.print("Power calculation of number :"+result);
	}
}