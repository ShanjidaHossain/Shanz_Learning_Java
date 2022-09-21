package com.infy.service;

import java.util.Map;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;

public interface CandidateService {
	public abstract String addCandidate(Candidate candidate) throws InfyAcademyException;
	public abstract String calculateGrade(CandidateReport candidateReportTO);
	public abstract Map<Integer, String> getGradesForAllCandidates() throws InfyAcademyException;
}
