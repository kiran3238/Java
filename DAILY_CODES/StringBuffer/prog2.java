class StringBufferDemo{

	public static void main(String[]args){


		StringBuffer sb=new StringBuffer();

			System.out.println(sb.capacity());//16

			sb.append("Kiran");

			System.out.println(sb);//Kiran
			System.out.println(sb.capacity());//16

			sb.append("Core2web");

			System.out.println(sb);//KiranCore2web
			System.out.println(sb.capacity());//16
                        
			sb.append("Shende");
			System.out.println(sb);//KiranCore2webShende
			System.out.println(sb.capacity());//current capacity+1*2=16=1*2=34
	}
}
