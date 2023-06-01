//RealTime Example
class SharkTank{

	String StartupName="Jugaadu Kamlesh";
	String EnterpreneurName="Piyush Bansal";
	float FunAmount=400000;
	static float Total_Investment=900000;

	void startup(){

		System.out.println("Startup Name:"+ StartupName);
		System.out.println("Enterpreneur Name:"+ EnterpreneurName);
		System.out.println("Funding Amount:"+ FunAmount);
		System.out.println("Total Investment:"+ Total_Investment);

	}
}
class User{

	public static void main(String[]args){

		SharkTank st1 =new SharkTank();
		SharkTank st2 =new SharkTank();

		st1.startup();
		st2.startup();

		System.out.println("----------------------");

		st2.StartupName="Revamp Moto";
		st2.EnterpreneurName="Aman Gupta";
		st2.FunAmount=800000;
		st2.Total_Investment=9900000;

		st1.startup();
		st2.startup();
	}
}
