package com.teamtempo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.teamtempo.domain.Respondent;
import com.teamtempo.domain.Survey;

public class RespondentRowMapper implements RowMapper<Respondent>{
	public Respondent mapRow(ResultSet rs, int row) throws SQLException {
	Respondent rp = new Respondent();
		rp.setRespondent_uuid(rs.getString("new_respondent"));
		return rp;
	}
}
