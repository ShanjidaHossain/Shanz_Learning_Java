package com.infy.model;

public class CandidateReport {
	private Integer candidateId;
	private String candidateName;
	private Integer mark1;
	private Integer mark2;
	private Integer mark3;
	private Character result;
	private String grade;
	
	public CandidateReport(Integer candidateId, String candidateName, Integer mark1, Integer mark2, Integer mark3,
			Character result, String grade) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.result = result;
		this.grade = grade;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
