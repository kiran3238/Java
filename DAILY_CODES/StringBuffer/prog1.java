class StringBufferDemo{

	public static void main(String[]args){


		StringBuffer str1 =new StringBuffer("Kiran");

		System.out.println(System.identityHashCode(str1));//1000
		str1.append("Shende");

		System.out.println(str1);//KiranShende
		System.out.println(System.identityHashCode(str1));//1000

	}
}
