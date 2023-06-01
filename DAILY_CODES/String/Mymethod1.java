//MY Own str Length Function Method
//
import java.io.*;

class LengthDemo{

	public static void main(String[]args)throws IOException {


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		String str1=br.readLine();
	

		int len=mystrLen(str1);

		System.out.println(len);
	}

static int mystrLen(String str){

	char arr[]=str.toCharArray();

	int count=0;


	for(int i=0;i<arr.length;i++){

		count++;


	}
	return count;
}
}
