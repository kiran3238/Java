//RealTime Example

class Bags{

	float Price=250;
	static  String BagCompany="Fancy";
	int NoOfBags=20;

	void BagInfo(){

		System.out.println(" Price Of Each Bag is:"+Price);
		System.out.println(" Company Of Bag is:"+BagCompany);
		System.out.println(" Total Number Of Bags Count is:"+NoOfBags);

	}

	static void AdvBag(){

		System.out.println("It provides a safe and easy way to carry our things...");

	}
}
class Client{

	public static void main(String[]args){

		Bags obj1=new Bags();
		Bags obj2=new Bags();

		
		obj1.BagInfo();
		obj2.AdvBag();
	System.out.println("*------------------------------------------------*");
		obj1.BagCompany="American Tourist";
		obj1. Price=400;

		obj1.BagInfo();
		obj2.AdvBag();
		


	}
}

