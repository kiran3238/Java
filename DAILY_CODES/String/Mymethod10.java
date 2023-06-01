//equals() funtion in java:
//My own code for equals() functiono:
class EqualDemo{
        public static void main(String args[]){

                String str1="Shashi";
                String str2=new String("SHASHI");

                char ch1[]=str1.toCharArray();
                char ch2[]=str2.toCharArray();

                int flag=0;
                if(ch1.length==ch2.length)
                {
                        for(int i=0;i<ch1.length;i++)
                        {
                                if(ch1[i]==ch2[i])
                                {

                                        flag=1;
                                }

                                else{
                                        flag=0;
                                        break;
                                }
                        }

                        if(flag==1)
                        {
                                System.out.println("Strings are equal");
                        }

                        else
                        {
                                System.out.println("Strings not equal");
                        }

                }

                else
                {
                        System.out.println("Strings are not same.");
		}
	}
}
