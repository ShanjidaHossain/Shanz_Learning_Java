package com.infy.service;

import java.util.Map;

import com.infy.dao.CandidateDAO;
import com.infy.dao.CandidateDAOImpl;
import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;

public class CandidateServiceImpl implements CandidateService {
	private CandidateDAO candidateDAO = new CandidateDAOImpl();
	// can have status as 'P' only if all 3 marks are 50 and above
	public String addCandidate(Candidate candidate) throws InfyAcademyException {
		return null;
	}

	// calculating grade for candidate based on his marks and result
	public String calculateGrade(CandidateReport candidateReportTO) {
		String grade = null;
		if (candidateReportTO.getResult() == 'F') {
			grade = "NA";
		} else {
			float average = (candidateReportTO.getMark1() + candidateReportTO.getMark2() + candidateReportTO.getMark3())
					/ 3f;
			if(average >= 85.0)
				grade= "A";
			else if(average >= 75.0 && average < 85.0)
				grade= "B";
			else
				grade="C";
		}
		return grade;
	}

	// populating map<CandidateId, Grade> by calling
	// calculateGrade(candidateReportTO) and returning the same.
	public Map<Integer, String> getGradesForAllCandidates() throws InfyAcademyException {
		return null;
	}
}
