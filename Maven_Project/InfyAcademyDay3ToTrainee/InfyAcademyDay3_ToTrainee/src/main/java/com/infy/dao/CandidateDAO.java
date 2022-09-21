package com.infy.dao;

import java.util.List;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;

public interface CandidateDAO {
	public abstract String addCandidate(Candidate candidates) throws InfyAcademyException;
	public abstract List<CandidateReport> getAllCandidates() throws InfyAcademyException;
}
