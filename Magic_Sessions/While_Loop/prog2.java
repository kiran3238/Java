//WAP to calculate the factorial of given no
//
//i/p:  6
//o/p:  factorial 6 is 720
//
class Core2web{


	public static void main(String[]args){


		int num=6;

		int fact=1;
		int store=num;

		while(num!=0){


			fact=fact*num;

			num--;
		}
		System.out.println("factorial of"+store+"is" +fact);
	}
}
