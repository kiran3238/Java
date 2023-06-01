//print product of odd indexonly
//
//input: Enter size:6
//Elsements:1 2 3 4 5 6
//
//output:48
//2*4*6
//
import java.io.*;

class ArrayDemo{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter Array Elements");
		int mult=1;

		for(int i=0; i<arr.length;i++){


			arr[i]=Integer.parseInt(br.readLine());

			if(i%2!=0){

				mult=mult*arr[i];

			}
		}
		System.out.println("Mult of Odd Elements index:" + mult);
	}
}

