/*
 *
 * A  B  C  D
 * B C D
 * C  D 
 * D*/


import java.util.*;

class Solution5{

	public static void main(String[]args){


		char ch='A';

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter no of Rows");

		int rows=obj.nextInt();
		  
		for(int i=1;i<=rows;i++){
			char temp=ch;

			for(int j=rows;j>=i ;j--){

				System.out.print(temp++ +" ");
				

			}
			ch++;
			System.out.println();
		}
	}
}

