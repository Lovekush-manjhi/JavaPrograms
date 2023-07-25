// Program of check given character is vowel or consonant....?

// When input -> a,e,i,o,u or A,E,I,O,U : Vowel
// When input -> b,c,d,f..etc or B,C,D,F..etc : Consonant

import java.util.Scanner;
class VowelOrConsonant{
	public static void main(String args[]){
		// int ch;
		char ch;
		System.out.print("Enter a character :");
		Scanner obj=new Scanner(System.in);
		ch=obj.next().charAt(0);

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.print("Vowel Character.");
		}
		else{
			System.out.print("Consonant Character.");
		}
	}
}