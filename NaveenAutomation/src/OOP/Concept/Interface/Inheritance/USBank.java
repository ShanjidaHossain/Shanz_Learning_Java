package OOP.Concept.Interface.Inheritance;

public interface USBank {
	
	/*
	 - no main method 
	 - only method declaration --> no method body --> only method prototype
	 - we can declare the variable
	 - vars are by default static in nature || Final || Constant
	 - but method can't be static in interface
	 - variable value will not change
	 - methods are abstract in nature --> meaning we cannot instantiate, we can't create object
	 
	 */
	int min_balance = 100; // Final in nature  || Constant
	public void credit(); 
	public void debit();
	public void  transferMoney();

}
