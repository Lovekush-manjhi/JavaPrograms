// Program is sum of N Natural numbers...?

import java.util.Scanner;

class SumNaturalNum{
    public static void main(String args[]){
        int EndNum, i, add = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of term :");
        EndNum = obj.nextInt();

        for(i=1; i<=EndNum; i++){
            add = add+i;
        }
        System.out.print("Add of N natural numbers :" + add);
    }
}