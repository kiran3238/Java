//WAP to check whether the no is a palindrome no or not
//i/p:2332
//
//o/p:2332
//
class Core2web{

	public static void main(String[]args){

		int num=2332;
		int rev=0;
		int store=num;

		while(num !=0){

			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==store){

			System.out.println(store+"is a Palindrome");
		}else{

			System.out.println(store+"is not a Palindrome");
		}
	}
}
