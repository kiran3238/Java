class Demo{

	public static void main(String[]args){

		char ch='A';
		int x=65;
                int arr1[]={10,200,300};
		Integer arr2[]={10,200,300};

		System.out.println(System.identityHashCode(ch));
                System.out.println(System.identityHashCode(x));
        	System.out.println(System.identityHashCode(arr2[0]));	  
  		System.out.println(System.identityHashCode(arr2[1]));
		System.out.println(System.identityHashCode(arr2[2]));
		System.out.println(System.identityHashCode(arr2[0]));
		System.out.println(System.identityHashCode(arr2[1]));
                System.out.println(System.identityHashCode(arr2[2]));
	}
}
