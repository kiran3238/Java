//Take 7 character as i/p print only vowels from the array
//
//input: a b c o d p e
//
//output:a o e
//
import java.io.*;

class ArrayDemo{

	public static void main(String[]args)throws IOException{

		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter Array Size");

		int size=Integer.parseInt(br.readLine());

		char arr[]=new char[size];

		System.out.println("Enter Array Elements:");

		for(int i=0;i<size;i++){

			arr[i]=(char)br.read();
	                br.skip(2);		
		
		}
		System.out.print("The vowels are :");

		for(int i=0;i<arr.length;i++){


			if(arr[i]== 'a' ||arr[i]=='e' || arr[i]=='i' || arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){


				System.out.print(arr[i]+" ");
			}
		}
		}
	}

