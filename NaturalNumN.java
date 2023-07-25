// Program of print N natural numbers by given range...?

import java.util.Scanner;
 class NaturalNumN{

    public static void main(String args[]){
        int EndNum;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of term :");
        EndNum = obj.nextInt();

        System.out.print("First 10 natural numbers :");
        for(int i=1; i<=EndNum; i++){
            System.out.print(i + " ");
        }
    }
 }