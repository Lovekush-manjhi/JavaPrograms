// Program of print N Prime numbers in given range...?

import java.util.Scanner;
public class PrimeNumGivenRange{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a range :");
		int end=sc.nextInt();
		int count=0;
		for(int i=1; i<=end; i++){
			for(int start=1;start<=i;start++){
				if(i%start==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+" ");
			}
			count=0;
		}
	}
}


// import java.util.Scanner;
// public class PrimeNumGivenRange{
// 	public static void main(String args[]){
// 		Scanner sc=new Scanner(System.in);
// 		int end=sc.nextInt();
// 		int count=0;
// 		for(int i=1; i<=end; i++){
// 			for(int start=1;start<=i;start++){
// 				if(i%start==0){
// 					count++;
// 					// System.out.print(i+"hello-world ");
// 				}
// 			}
// 			System.out.println(count);
// 			// if(count==2){
// 			// 	System.out.print(i+"hh ");
// 			// }
// 			// else{
// 			// 	System.out.print("hello-world ");
// 			// }
// 		}
// 	}
// }
