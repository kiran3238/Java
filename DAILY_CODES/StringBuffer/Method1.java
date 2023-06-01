//Method 1:
//APPEND METHOD

class AppendDemo{

	public static void main(String[]args){

		StringBuffer str1=new StringBuffer("Kiran");

		StringBuffer str2=new StringBuffer("Shende");

		StringBuffer str3=str1.append(str2);

		System.out.println(str3);//KiranShende

		StringBuffer str4=new StringBuffer("Core2web");

		System.out.println(str4.append(str2));//Core2webShende
		System.out.println(str4.append(str1));//Core2webShendeKiranShende
	}
}
		
