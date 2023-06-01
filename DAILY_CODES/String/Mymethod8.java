// replace() function code by my own:

import java.io.*;

class ReplaceDemo{

        static String MyreplaceOf(String str,char ch1,char ch2){

                char arr[]=str.toCharArray();

                for(int i=0;i<arr.length;i++)
                {
                        if(arr[i]==ch1)
                        {
                                arr[i]=ch2;
                        }
                }

                String str2=new String(arr);
                return str2;
        }


        public static void main(String args[])throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the string:");
                String str=br.readLine();

                System.out.println("Enter the character which you want to change:");
                char ch1=(char) br.read();
                br.skip(1);

                System.out.println("Enter the character which you want to replace from previous character:");
                char ch2=(char) br.read();
                br.skip(1);

                String str1=MyreplaceOf(str,ch1,ch2);

                System.out.println(str1);
	}
}
