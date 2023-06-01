//WAP to print square of even digit of given number
//
//i/p: 1234
//o/p:  16 4 
//
class Core2web{


	public static void main(String[]args){


		int num=1234;

		while(num !=0){

			int rem=num %10;

			if(rem %2==0){

				System.out.print(rem*rem+ "");
			}
			num=num/10;
		}
	}
	
}



