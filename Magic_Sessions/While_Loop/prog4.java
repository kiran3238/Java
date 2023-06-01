//WAP to count odd digit of given number
//
//i/p: 85529
//
//o/p: 3
//
//
class Core2web{


	public static void main(String[]kiran){


		int num=85529;
		int count=0;


		while(num!=0){

			int rem=num%10;

			if(rem%2 !=0){

				count++;
	         	}
			num=num/10;
		}
		System.out.println(count);
		
		
		
	}
}



