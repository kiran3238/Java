// Concat() function code by my own:
import java.util.*;

class ConcatDemo{

        static String Myconcat(String str1,String str2){

                char arr1[]=str1.toCharArray();
                char arr2[]=str2.toCharArray();

                int size=arr1.length+arr2.length;

                char arr3[]=new char[size];

                for(int i=0;i<arr1.length;i++)
                {
                        arr3[i]=arr1[i];
                }

                for(int j=0;j<arr2.length;j++)
                {
                        arr3[j+arr1.length]=arr2[j];
                }

                String str3=new String(arr3);

                return str3;
        }

        public static void main(String args[]){

                Scanner sc=new Scanner(System.in);

                System.out.println("Enter the string1 and string2:");
                String str1=sc.nextLine();
                String str2=sc.nextLine();

                String str3=Myconcat(str1,str2);

                System.out.println(str3);
	}
}
