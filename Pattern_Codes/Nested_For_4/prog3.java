/*
 * 10
 * 10  9
 * 9   8  7
 * 7  6  5  4
 * */

import java.util.Scanner;
class Core2web{
	public static void main(String[]args){

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int rows=obj.nextInt();
                
		int num=10;
		for(int i=1;i<=rows;i++){

			for(int j=1;j<=i;j++){

				System.out.print(num-- + " ");
			}
			num++;
			System.out.println(" ");
		}
	}
}




