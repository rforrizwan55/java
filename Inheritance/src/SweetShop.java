
public class SweetShop {

	public static void main(String[] args) {
		IceCream ic =new IceCream();
		ic.numberOfScoopsIceCream = 2;
		System.out.println("Price of icecream"+ic.getIceCreamPrise());
		
		GulabJamun gj = new GulabJamun();
		gj.numberOfGulabJamuns = 3;
		gj.numberOfScoopsIceCream = 1;
		System.out.println("Price of GulabJamun with icecream"+gj.getPriceOfGJWithIC()+": Price of icecream only:"+gj.getIceCreamPrise());
		
		KubaniKaMeeta kkm = new KubaniKaMeeta();
		kkm.numberOfScoopsIceCream = 5;
		kkm.numberOfScoopsKK = 6;
		System.out.println("Price of Kubani with icecream"+kkm.getPriceOfKKMWithIC()+": Price of icecream only:"+kkm.getIceCreamPrise());
		

	}

}

class IceCream {

	int numberOfScoopsIceCream;

	public double getIceCreamPrise() {

		double pricePerScoop = 1.25;
		return numberOfScoopsIceCream * pricePerScoop;
	}

}

class GulabJamun extends IceCream {
	int numberOfGulabJamuns;

	double getPriceOfGJWithIC() {
		double priceOfGJ = 0.5;
		return numberOfGulabJamuns * priceOfGJ + getIceCreamPrise();
	}
}

class KubaniKaMeeta extends IceCream {
	int numberOfScoopsKK;
	
	double getPriceOfKKMWithIC(){
		double priceOfKKM = 1.15;
		return numberOfScoopsKK * priceOfKKM + getIceCreamPrise();
	}

}
