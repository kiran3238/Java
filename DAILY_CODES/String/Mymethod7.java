// lastIndexOf() function code by my own:

import java.io.*;

class LastDemo{

        static int MylastIndexOf(String str,char ch,int number){

                char arr[]=str.toCharArray();
                int k=0;
                int flag=1;

                for(int i=number;i>=0;i--)
                {
                        if(ch==arr[i]){

                                k=i;
                                flag=0;
                                break;
                        }
                }
                if(flag==0)
                {
                        return k;
                }
                else{
                        return -1;
                }

        }


        public static void main(String args[])throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the String:");
                String str=br.readLine();

                System.out.println("Enter the character which you want:");
                char ch=(char) br.read();
                br.skip(1);

                System.out.println("Enter the number where you want to stop your string:");
                int number=Integer.parseInt(br.readLine());

                int x=MylastIndexOf(str,ch,number);

                System.out.println(x);
		}
}
