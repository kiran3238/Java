//LOGICAL OPERATOR
//
//
class Logical{

	public static void main(String[]args){

		int x=5;
		int y=7;

		boolean ans1=x<y && y<x;// && chya before and after condition dyave lagtat
		boolean ans2=x<y || y<x;

		System.out.println(ans1);//false
		System.out.println(ans2);//true

	}
}

