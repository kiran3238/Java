/*
 * 1
 * 2  3
 * 3  4  5
 * 4  5  6  7
 * */

import java.util.*;

class Solution6{

public static void main(String[]args){

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no of Rows");

	int rows=obj.nextInt();

	for(int i=1;i<=rows;i++){
		int temp=i;

		for(int j=1;j<=i;j++){

			System.out.print(temp++ +" ");

		}
		System.out.println();
	}
}
}


