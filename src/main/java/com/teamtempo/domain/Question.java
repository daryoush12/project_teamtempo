package com.teamtempo.domain;

public class Question {
private String querie_detail_uuid; //Linkkaa answer taulukossa vastauksiin.
private String inquiry;
private String type;
private String style;
private String context;
private String querie_ordinal;
private String querie_detail_serial;
private String required;
private String option;





public String getOption() {
	return option;
}


public void setOption(String option) {
	this.option = option;
}


public String getQuerie_detail_uuid() {
	return querie_detail_uuid;
}


public void setQuerie_detail_uuid(String querie_detail_uuid) {
	this.querie_detail_uuid = querie_detail_uuid;
}



public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public String getStyle() {
	return style;
}


public void setStyle(String style) {
	this.style = style;
}


public String getContext() {
	return context;
}


public void setContext(String context) {
	this.context = context;
}


public String getQuerie_ordinal() {
	return querie_ordinal;
}


public void setQuerie_ordinal(String querie_ordinal) {
	this.querie_ordinal = querie_ordinal;
}


public String getQuerie_detail_serial() {
	return querie_detail_serial;
}


public void setQuerie_detail_serial(String querie_detail_serial) {
	this.querie_detail_serial = querie_detail_serial;
}


public String getRequired() {
	return required;
}


public void setRequired(String required) {
	this.required = required;
}


public Question() {
	super();
	// TODO Auto-generated constructor stub
}


public String getInquiry() {
	return inquiry;
}


public void setInquiry(String inquiry) {
	this.inquiry = inquiry;
}


}
