/* c2w10
 * c2w9  c2w8
 * c2w7  c2w6  c2w5
 * c2w4  c2w3  c2w2  c2w1
 **/

class Core2web{

	public static void main(String[]args){

             int x=10;
		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){

				System.out.print("C2w"+x-- +" ");
			}
			System.out.println();

		}
	}
}
