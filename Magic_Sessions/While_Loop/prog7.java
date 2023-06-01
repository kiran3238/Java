//WAP Take no from user if no is even print that no in reverse order if no. is odd print in reverse by diff of 2;
//
//i/p:       o/p
//
//6          6 5 4 3 2 1 
//
//7          7 5 3 1

class Core2web{

	public static void main(String[]args){


		int num=7;


		if(num %2==0){

			while(num>0){

				System.out.print(num+ " ");	
				num--;
			}
		}else{
				while(num>0){
	         		System.out.print(num+" ");
				num=num-2;
				}
			
		}
	}
}

						


