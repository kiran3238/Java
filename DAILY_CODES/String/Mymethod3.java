// CompareToIgnoreCase code by my own

import java.io.*;

class CompreIgnoreDemo{

        static int  MycompareToIgnoreCase(String str1,String str2){

                char arr1[]=str1.toCharArray();
                char arr2[]=str2.toCharArray();

                int flag=1;
                int k=0;
                int x;

                if(arr1.length==arr2.length)
                {
                        for(int i=0;i<arr1.length;i++)
                        {
                                if(arr1[i]==arr2[i] || arr1[i]+32==arr2[i] || arr1[i]==arr2[i]+32)
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

                        if(flag==1)
                       {
                          return 0;
                       }
                       else
                       {
                          return arr1[k]-arr2[k];

                       }

                }
                else
                {
                    if(arr1.length>arr2.length)
                    {
                            for(int p=0;p<arr2.length;p++)
                            {
                                    if(arr1[p]==arr2[p] || arr1[p]+32==arr2[p] || arr1[p]==arr2[p]+32)
                                    {
                                            flag=1;
                                    }
                                    else
                                    {
                                            k=p;
                                            flag=0;
                                            break;
                                    }
                            }

                            if(flag==1)
                            {
                                    return arr1.length-arr2.length;
                            }
                            else
                            {
                                    return arr1[k]-arr2[k];
                            }


                        }
                    else
                          {
                                  for(int j=0;j<arr1.length;j++)
                                  {
                                          if(arr1[j]==arr2[j] || arr1[j]+32==arr2[j] || arr1[j]==arr2[j]+32)
                                          {
                                                 flag=1;
                                          }
                                          else
                                          {
                                                  k=j;
                                                  flag=0;
                                                  break;
                                          }
                                  }

                                  if(flag==1)
                                  {
                                          return arr1.length-arr2.length;
                                  }
                                  else
                                  {
                                          return arr1[k]-arr2[k];
                                  }
                          }




        }
        }



        public static void main(String args[])throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the String1:");
                String str1=br.readLine();

                System.out.println("Enter the String2:");
                String str2=br.readLine();

                int y=MycompareToIgnoreCase(str1,str2);

                System.out.println(y);
	}
}	
