class Core2web{

	public static void main(String[]args){

		int n=2332;
		int a=0;
		int b=n;

		while(n>0){

			a=(a*10)+(n%10);
			n=n/10;
		}
		if(b==a){
			System.out.println("Palindrome");
		}else{
			System.out.println(" Not Palindrome");
		}
	}
}

