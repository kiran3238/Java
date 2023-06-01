class StringDemo{

	public static void main(String[]args){

		String str1="Kiran";

		String str2=new String("Kiran");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

			if(str1==str2){//Identiy Hash code checked it....

			System.out.println("Strings are Equal");

		}else{

			System.out.println("Strings are Not Equal");
		}
		if(str1.equals(str2)){//content checked it.....


			System.out.println("Strings are Equal");
		}else{

			System.out.println("Strings are NOT Equal");
		}
	}

		
}
