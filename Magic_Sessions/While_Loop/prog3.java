//WAP to count digits of given number 
//
//
//i/p: 8552917242
//o/p: 10
//
class Core2web{

	public static void main(String[]args){


		int num=85529;

		int count=0;


		while(num!=0){

			num=num/10;

			count++;

		}
		System.out.println(count);
	}
}


