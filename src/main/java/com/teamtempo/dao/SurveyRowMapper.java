package com.teamtempo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.teamtempo.domain.Survey;


public class SurveyRowMapper implements RowMapper<Survey> {
	public Survey mapRow(ResultSet rs, int row) throws SQLException {
		Survey su = new Survey();
		su.setQuerie_uuid(rs.getString("querie_uuid"));
		return su;
	}
}
