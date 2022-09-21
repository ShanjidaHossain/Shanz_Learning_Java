package com.infy.model;

import java.time.LocalDate;

public class Candidate {
	
	private Integer candidateId;
	private String candidateName;
	private Integer mark1;
	private Integer mark2;
	private Integer mark3;
	private Character result;
	private String department;
	private LocalDate examDate;	
	
	public Candidate(Integer candidateId, String candidateName, Integer mark1, Integer mark2, Integer mark3,
			Character result, String department, LocalDate examDate) {
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.result = result;
		this.department = department;
		this.examDate = examDate;
	}
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public Integer getMark1() {
		return mark1;
	}
	public void setMark1(Integer mark1) {
		this.mark1 = mark1;
	}
	public Integer getMark2() {
		return mark2;
	}
	public void setMark2(Integer mark2) {
		this.mark2 = mark2;
	}
	public Integer getMark3() {
		return mark3;
	}
	public void setMark3(Integer mark3) {
		this.mark3 = mark3;
	}
	public Character getResult() {
		return result;
	}
	public void setResult(Character result) {
		this.result = result;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LocalDate getExamDate() {
		return examDate;
	}
	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}
	
}