//WAP to print the sum of all even number & mult of odd no. between 1 to 10.
//
//o/p:  Sum of even no. between 1 to 10=30
 //       Multiplication of odd no. 1 to 10=945
 //
class Core2web{

	public static void main(String[]args){


		int x=1;
		int y=10;
		int sum=0;
		int mult=1;

		while(x<=y){

			if(x%2==0){

				sum=sum+x;
				x++;
			}else{
				mult=mult*x;
				x++;
			}
		}
		System.out.println("Sum of even no.between 1 to 10="+sum);
		System.out.println("Multiplication of odd no.between 1 to 10="+mult);

	}
}


