/*
 * 1  2  3   4
 * 2  3  4 
 * 3  4 
 * 4*/


import java.util.*;

class Core2web{

	public static void main(String[]args){

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number od Rows");

		int rows=obj.nextInt();


		for(int i=1;i<=rows;i++){
			int temp=i;
			for(int j=rows;j>=i; j--){

				System.out.print(temp+" ");
				temp++;

			}
			
			System.out.println();
		}
	}
}
