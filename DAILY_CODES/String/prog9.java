//HASHCODE CONCEPT
//
class HashCodeDemo{

	public static void main (String[]args){

		String str1="Kiran";
		String str2=new String("Kiran");
		String str3="Kiran";
		String str4=new String("Kiran");


		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
