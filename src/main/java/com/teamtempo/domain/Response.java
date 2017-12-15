package com.teamtempo.domain;

import java.util.List;

public class Response {
	private String querie_uuid;
	private String respondent_uuid;
	private List<Answer> answers;
	public String getQuerie_uuid() {
		return querie_uuid;
	}
	public void setQuerie_uuid(String querie_uuid) {
		this.querie_uuid = querie_uuid;
	}
	public String getRespondent_uuid() {
		return respondent_uuid;
	}
	public void setRespondent_uuid(String respondent_uuid) {
		this.respondent_uuid = respondent_uuid;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
}
