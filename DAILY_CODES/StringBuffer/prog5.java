class SBDemo{

	public static void main(String[]args){

		String str1="Kiran";
		String str2=new String("Shende");
		StringBuffer str3=new StringBuffer("Core2web");

		//String str4=str1.concat(str3);concat method laa parameter fakt String chach lagto ethe StringBuffer aheee....
		String str4=str1.concat(str2);
                StringBuffer str5=str3.append(str2);
		  
		System.out.println(str1);//Kiran
		System.out.println(str2);//Shende
		System.out.println(str3);//Core2webShende
		System.out.println(str4);//KiranShende
		System.out.println(str5);//Core2webShende

		System.out.println(System.identityHashCode(str1));//100
		System.out.println(System.identityHashCode(str2));//200
		System.out.println(System.identityHashCode(str3));//300
		System.out.println(System.identityHashCode(str4));//400
		System.out.println(System.identityHashCode(str5));//300
	}
}

