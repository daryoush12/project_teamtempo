package com.teamtempo.domain;

public class Answer {
	private String querie_detail_id;
	private String querie_id;
	private String respondent_id;
	public String getQuerie_id() {
		return querie_id;
	}
	public void setQuerie_id(String querie_id) {
		this.querie_id = querie_id;
	}
	public String getRespondent_id() {
		return respondent_id;
	}
	public void setRespondent_id(String respondent_id) {
		this.respondent_id = respondent_id;
	}
	private String answer_value;
	
	public String getQuerie_detail_id() {
		return querie_detail_id;
	}
	public void setQuerie_detail_id(String querie_detail_id) {
		this.querie_detail_id = querie_detail_id;
	}
	public String getAnswer_value() {
		return answer_value;
	}
	public void setAnswer_value(String answer_value) {
		this.answer_value = answer_value;
	}

	
	
}
