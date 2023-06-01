class Stringdemo{

	public static void main(String[]args){

		String str1="Kiran";
		String str2="Shende";
                System.out.println(str1+str2);

		String str3="KiranShende";
		System.out.println(str3);

		System.out.println(System.identityHashCode(str1));//1000
		System.out.println(System.identityHashCode(str2));//2000
		System.out.println(System.identityHashCode(str3));//3000
	}
}


