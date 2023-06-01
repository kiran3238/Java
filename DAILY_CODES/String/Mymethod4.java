// equalsIgnoreCase Code by my own:

import java.util.*;

class EqualsIgnoreDemo{


        static boolean myequalsIgnoreCase(String str1,String str2){

                char arr1[]=str1.toCharArray();
                char arr2[]=str2.toCharArray();

                int flag=1;

                if(arr1.length==arr2.length){

                        for(int i=0;i<arr1.length;i++)
                        {
                                if(arr1[i]==arr2[i] || arr1[i]+32==arr2[i] || arr1[i]==arr2[i]+32){

                                        flag=1;
                                }

                                else{
                                        flag=0;
                                        break;
                                }
                        }

                        if(flag==1){
                                return true;
                        }
                        else{
                                return false;
                        }
                }
                else{
                        return false;
                }
        }


        public static void main(String args[]){

                Scanner sc=new Scanner(System.in);

                System.out.println("Enter the String1 and String2:");
                String str1=sc.nextLine();
                String str2=sc.nextLine();

                boolean x=myequalsIgnoreCase(str1,str2);

                System.out.println(x);
	}
}
