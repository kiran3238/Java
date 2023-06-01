class SBDemo{

	public static void main(String[]args){


		StringBuffer sb=new StringBuffer(100);//Initial Capacity

		sb.append("Biencaps");

		System.out.println(sb);//Biencaps
		System.out.println(sb.capacity());//100

		sb.append("Core2web");

		System.out.println(sb);//BiencapsCore2web
		System.out.println(sb.capacity());//100

		sb.append("Kiran");

		System.out.println(sb);//BiencapsCore2webKiran
		System.out.println(sb.capacity());//100
		sb.append("Shende");

		System.out.println(sb);//BiencapsCore2webKiranShende
		System.out.println(sb.capacity());//100.... when character is more than 100 then use Formula....{Current capacity+1*2=100+1*2=202}
	}
}

