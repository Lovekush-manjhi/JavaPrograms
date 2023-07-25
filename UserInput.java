// Program of user input methods and || int with string input problem solution...?

// import java.util.*;
import java.util.Scanner;
class UserInput{

	public static void main(String args[]){
		
        Scanner obj = new Scanner(System.in);
		System.out.print("Enter employee name :");
        String name = obj.nextLine();

        System.out.print("Enter employee age :");
        int age = obj.nextInt();

        System.out.print("Enter employee sallery :");
        float sallery = obj.nextFloat();

		System.out.print("Enter first char of name :");
		char letter = obj.next().charAt(0);

		System.out.println("Employee name is :"+name);
		System.out.println("Employee age is :"+age);
		System.out.println("Employee sallery is :"+sallery);
		System.out.println("Name's first letter :"+letter);

	}
}

// String input problem and solution.....?

// import java.util.Scanner;
// class userInput{

// 	public static void main(String args[]){

// 		Scanner obj = new Scanner(System.in);

// 		// Not take string input....

// 		// System.out.print("Enter age :");
// 		// int a = obj.nextInt(); 
// 		// System.out.print("Enter name :");
// 		// String b = obj.nextLine();

// 		// Using parseInt()....

// 		// System.out.print("Enter age :");
// 		// int a = Integer.parseInt(obj.nextLine());
// 		// System.out.print("Enter name :");
// 		// String b = obj.nextLine();


// 		// Using nextLine()....
		
// 		System.out.print("Enter age :");
// 		int a = obj.nextInt(); 
// 		obj.nextLine(); 
// 		System.out.print("Enter name :");
// 		String b = obj.nextLine();

// 		// Output....

// 		System.out.println("Your age is :"+a);
// 		System.out.println("Your name is :"+b);
// 	}
// }