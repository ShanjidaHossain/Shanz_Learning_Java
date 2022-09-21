package OOP.Concept.Interface.Inheritance;

public class HSBCBank implements USBank , BrazilBank{
	
	//We are achieving Multiple Inheritance
	//Is-a relationship (Interface and Class)-- Use of the Implement Key Word

	// If a class is implementing any Interface, then it is mandatory to define/override all the method in the interface
	
	//HSBC Bank method
	public void educationLoan() {
		System.out.println("-- HSBC Education Loan --");
	}

	public void carLoan() {
		System.out.println("-- HSBC Car Loan --");
	}
		
	//USBank Interface Method -- OverRiding from USBank
	@Override
	public void credit() {
		System.out.println("-- HSBC Credit --");	
	}

	@Override
	public void debit() {
		System.out.println("-- HSBC Debit --");		
	}

	@Override
	public void transferMoney() {
		System.out.println("-- HSBC Transfer Money --");		
	}

	//Brazil Interface method -- OverRiding from Brazil
	@Override
	public void mutualFund() {
		System.out.println("-- HSBC -Brazil -- Mutual Funds --");
		
	}
}
