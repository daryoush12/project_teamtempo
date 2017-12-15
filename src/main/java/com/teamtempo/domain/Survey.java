package com.teamtempo.domain;

import java.util.List;

public class Survey {
private String querie_uuid;
private List<Question> querie_detail;
//Tähän mahdollisesti Lista kyselyn kysymyksiä?
//---------------------------------------------

public Survey() {
	super();
	// TODO Auto-generated constructor stub
}

public String getQuerie_uuid() {
	return querie_uuid;
}

public void setQuerie_uuid(String querie_uuid) {
	this.querie_uuid = querie_uuid;
}

public List<Question> getQuerie_detail() {
	return querie_detail;
}

public void setQuerie_detail(List<Question> querie_detail) {
	this.querie_detail = querie_detail;
}



}
