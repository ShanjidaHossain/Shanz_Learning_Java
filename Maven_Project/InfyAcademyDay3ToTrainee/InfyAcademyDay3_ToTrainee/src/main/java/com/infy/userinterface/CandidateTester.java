package com.infy.userinterface;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.service.CandidateService;
import com.infy.service.CandidateServiceImpl;

/**
 * Creates the user object and calls the methods in the service class. This is a
 * temporary class and will be replaced once the client tier is developed
 * 
 * @author ETA
 */

public class CandidateTester {

	
	
	public static void main(String[] args) throws Exception {
		 addCandidates();
		getGradesForAllCandidates();
	}

	public static void addCandidates() {
		String message = null;
		try {
			CandidateService candidateService = new CandidateServiceImpl();
			
			LocalDate examDate = LocalDate.of(2014, 5, 29);
			Candidate candidate = new Candidate(
					12346, "Sam", 51, 56, 78, 'P', "ECE", examDate);
			
			message = candidateService.addCandidate(candidate);
	
			System.out.println(message);
		} catch (InfyAcademyException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void getGradesForAllCandidates(){
		
		try {
			CandidateService candidateService = new CandidateServiceImpl();
			Map<Integer, String> allCandidatesMap = candidateService
					.getGradesForAllCandidates(); 
			System.out.println("\tCandidate ID\t\tResult");
			System.out.println("\t************\t\t******");
			Set<Integer> set = allCandidatesMap.keySet();
			for (Integer candidateId : set) {
				System.out.println("\t"+candidateId + "\t\t\t"
						+ allCandidatesMap.get(candidateId));
			}

		} catch (InfyAcademyException e) {
			System.out.println("\t\t"+e.getMessage());
		}
	}

}
