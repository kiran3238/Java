// my own compareTo Function

import java.io.*;

class CompareDemo{

        static int MycompareTo(String str1,String str2){

                char ch1[]=str1.toCharArray();
                char ch2[]=str2.toCharArray();
                int flag=1;

                int k=0;

                if(ch1.length!=ch2.length)
                {
                        if(ch1.length>ch2.length)
                        {
                                return 1;
                        }
                        else
                        {
                                return -1;
                        }
                }

                else
                {
                        for(int i=0;i<ch1.length;i++)
                        {
                                if(ch1[i]==ch2[i])
                                {
                                        flag=1;
                                }

                                else
                                {
                                        flag=0;
                                        k=i;
                                        break;
                                }
                        }

                        if(flag==0)
                        {
                                return ch1[k]-ch2[k];

                        }

                        else
                        {
                                return 0;
                        }
                }
        }



        public static void main(String args[])throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the string1:");
                String str1=br.readLine();

                System.out.println("Enter the string2:");
                String str2=br.readLine();

                int x=MycompareTo(str1,str2);

                System.out.println(x);
	}
}
