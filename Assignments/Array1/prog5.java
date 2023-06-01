//WAP take 10 input from the user and only elements thqt are divisible by 5 print it
//
//i/p: 10 2 2 3 3 3 4 4 22 55
//o/p:10 25 55
//
import java.io.*;

class ArrayDemo{

	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		int arr[]=new int[10];
		System.out.println("Enter array Elements");

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());

		}
		System.out.println("Divisible By 5:");

		for(int i=0;i<arr.length;i++){

			if(arr[i]%5==0){

				System.out.println(arr[i]+" ");

			}
		}
	}
}


