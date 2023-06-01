//mysubstring:

import java.util.*;

class SubstringDemo{

        static String Mysubstring(String str,int x,int y){

                char arr1[]=str.toCharArray();
                char arr2[]=new char[y-x];


                for(int i=x;i<y;i++)
                {
                        arr2[i-x]=arr1[i];
                }

                String str2=new String(arr2);
                return str2;
        }




        public static void main(String args[]){

                Scanner sc=new Scanner(System.in);

                System.out.println("Enter the string:");
                String str=sc.nextLine();

                System.out.println("Enter the starting number where you want to start:");
                int x=sc.nextInt();

                System.out.println("Enter the ending number where you want to end that string:");
                int y=sc.nextInt();

        String str2=Mysubstring(str,x,y);

        System.out.println(str2);
	}
}
