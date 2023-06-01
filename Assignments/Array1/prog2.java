//Take integer elements from user print product of even elements only
//input: Enter Size: 9
//1 2 3 2 5 10 55 77 99
//
//output:40 [2*2*10]
//
//
import java.io.*;

class ArrayDemo{

	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));

		System.out.println("Enter size of Array");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		int mult=1;

		System.out.println("Enter Array Elements");

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2==0){

				mult=mult*arr[i];
			}
		}
		System.out.println("The Product of Even Number is:"+mult);
	}
}

