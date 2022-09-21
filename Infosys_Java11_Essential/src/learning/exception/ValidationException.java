package learning.exception;


class ValidationException extends Exception{
  public ValidationException(String message){
    super(message);
  }
}

class AgeValidator {
	
	// throws keyword indicates that this method might throw an exception
	public void checkAge(int age) throws ValidationException {
		if(age>19) {
			throw new ValidationException("Not eligible to be selected"); 
			//throw keyword explicitly throw an exception 
		}
		else {
			System.out.println("Eligible to to be selected");			
		}
	}
}


class Tester {
	
	public static void main(String[] args) {
		AgeValidator validator = new AgeValidator();
		int[] ageList = { 15, 16, 18, 17, 19, 20, 14,15 };
		for (int index : ageList) {
			try {
				validator.checkAge(index);
			} catch (ValidationException e) {
				// Uncomment below line to understand the flow of the exception				
				// e.printStackTrace();
				System.out.println("Error: "+e.getMessage());
			}
		}	
	}
	
}