class StringDemo{

	public static void main(String[] args){

		String str1="Kiran";

		String str2=new String("Kiran");

		char str3[]={'c','2','w'};
		String str4=new String(str3);

		System.out.println(str1);//SCP 
		
		System.out.println(str2);//Heap
		System.out.println(str4);//Heap
	}
}


