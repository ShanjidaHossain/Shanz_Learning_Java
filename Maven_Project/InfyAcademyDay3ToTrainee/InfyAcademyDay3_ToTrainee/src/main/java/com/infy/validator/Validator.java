package com.infy.validator;

import java.time.LocalDate;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;

public class Validator {

	public void validate(Candidate candidate) throws InfyAcademyException {	
		
	}	

	// The entered candidate name should contain only alphabets. Cannot have
	// special characters and only spaces
	public Boolean isValidCandidateName(String candidateName) {
		return candidateName.matches("[A-Za-z]+");
	}

	// The entered candidate ID should be of size 5
	public Boolean isValidCandidateId(Integer candidateId) {
		return candidateId.toString().length() == 5;
	}

	// The entered Department name should be one among the given departments
	// (ECE, CSE, IT, EEE)
	public Boolean isValidDepartment(String department) {
		return department.matches("(ECE|CSE|IT|EEE)");
	}

	// exam date cannot be today or after todays date
	public Boolean isValidExamDate(LocalDate examDate) {
		return examDate.isBefore(LocalDate.now());
	}
	
	//Checking if marks are not equal to "0"
	public Boolean isValidExamMarks(Candidate candidateTO) {
		return candidateTO.getMark1()>0 && candidateTO.getMark2()>0
				&& candidateTO.getMark3()>0;
	}
	
	//Checking if result set is either 'P' or 'F' only
	public Boolean isValidResult(Character result) {
		return result.toString().matches("P|F");
	}


}
