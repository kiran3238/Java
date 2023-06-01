class StringDemo{

	public static void main(String[]args){

		String str1="Kiran";
		String str2=new String("Kiran");

		System.out.println(System.identityHashCode(str1));//1000 SCP
		System.out.println(System.identityHashCode(str2));//2000 Heap

		String str3="Kiran";
		String str4=new String("Kiran");

		System.out.println(System.identityHashCode(str3));//1000  SCP
		System.out.println(System.identityHashCode(str4));//3000  Heap
	}
}



