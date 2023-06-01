class StringDemo{

	public static void main(String[]args){

		String str1="Kanha";
		String str3=str1;
		String str2=new String(str1);


		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
	
