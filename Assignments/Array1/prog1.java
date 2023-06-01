//WAP to take of an array from the user and also take an integer elements from user Print sum of odd elements only
//
//input: enter size: 5
//Enter array element:1 2 3 4 5
//
//output: 9(1+3+5)
import java.io.*;

class ArrayDemo{

	public static void main(String[]args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		System.out.println("Enter Array Elements:");

		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){

		          arr[i]=Integer.parseInt(br.readLine());
		}
		int sumodd=0;
		for(int i=0;i<arr.length;i++){

			if(arr[i]%2!=0){

				sumodd=sumodd+arr[i];
			}
		}
		System.out.println("Sum of odd Elements is:"+ sumodd);
	}
}

