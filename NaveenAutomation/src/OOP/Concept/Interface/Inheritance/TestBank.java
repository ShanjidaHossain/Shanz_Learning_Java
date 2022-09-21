package OOP.Concept.Interface.Inheritance;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_balance);
		
		//Compile time polymorphism --> we are using overriding method
		HSBCBank hs = new HSBCBank();		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		
		
		//Dynamic Polymorphism
		//Child class object getting referred by parent interface reference variable
		
		USBank usb = new HSBCBank();
		usb.credit();
		usb.debit();
		usb.transferMoney();
	
		
	}

}
