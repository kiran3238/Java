// indexOf() function code by my own:
import java.io.*;
class IndexOfDemo{

        static int MyindexOf(String str,char ch,int number){

                char arr[]=str.toCharArray();

                int k=number;
                int flag=1;

                for(int i=number;i<arr.length;i++)
                {


                        if(arr[i]==ch)
                        {
                                flag=0;
                                break;
                        }
                        k++;
                }
                if(flag==0)
                {
                        return k;
                }
                else
                {
                        return -1;
                }
        }

        public static void main(String args[])throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the String:");
                String str=br.readLine();

                System.out.println("Enter the character which you want to search:");
                char ch=(char) br.read();
                br.skip(1);

                System.out.println("Enter the number from where you want to start:");
                int number=Integer.parseInt(br.readLine());


                int x=MyindexOf(str,ch,number);

                System.out.println(x);
	}
}
