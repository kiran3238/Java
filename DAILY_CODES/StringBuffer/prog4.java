class SBDemo{

	public static void main(String[]args){

		String str1="Kiran";

		String str2=new String("Shende");

		StringBuffer str3=new StringBuffer("Core2web");

	//	String str4=str1.append(str3);ERROR BCZ str3 he append honar str1 var but str1 heee String chi method ahee so String is immutable

		StringBuffer str5=str3.append(str1);

		System.out.println(str1);//Kiran
		System.out.println(str2);//Shende
		System.out.println(str3);//Core2web
		System.out.println(str5);//Core2webKiran

		System.out.println(System.identityHashCode(str1));//100
		System.out.println(System.identityHashCode(str2));//200
		System.out.println(System.identityHashCode(str3));//300
		System.out.println(System.identityHashCode(str5));//300
	}
}


