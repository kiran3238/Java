//RealTime Example
//
class State{

	String Name="Maharastra";
	long Population=9000000;

	void Metro(){

		String Metro1="Delhi";
		long Metro1Popu=350000;

		String Metro2="Banglore";
		long Metro2Popu=300000;

		System.out.println("State Name:"+Name);
		System.out.println("Sate Population:"+Population);
		
		System.out.println("Metro City Name1:"+Metro1);
		System.out.println("Metro City Population1:"+Metro1Popu);
		
		System.out.println("Metro City Name2:"+Metro2);
		System.out.println("Metro City Population2:"+Metro2Popu);
	}
}

class User{

	public static void main(String[]args){

		State obj=new State();
		obj.Metro();

	}
}
