package com.infy.dao;

import java.util.List;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;

public class CandidateDAOImpl implements CandidateDAO {

	public String addCandidate(Candidate candidates) throws InfyAcademyException {
		return "Candidate details are successfully added.";
	}

	public List<CandidateReport> getAllCandidates() throws InfyAcademyException {

		CandidateReport candidate = new CandidateReport(80004, "John", 90, 80, 70, 'P', null);
		CandidateReport candidate1 = new CandidateReport(80005, "Marshal", 33, 60, 70, 'F', null);
		CandidateReport candidate2 = new CandidateReport(80002, "Jacob", 99, 80, 90, 'P', null);
		CandidateReport candidate3 = new CandidateReport(80001, "Samuel", 30, 80, 90, 'F', null);
		CandidateReport candidate4 = new CandidateReport(80003, "Jack", 60, 60, 60, 'P', null);

		return List.of(candidate, candidate1, candidate2, candidate3, candidate4);
	}
}
