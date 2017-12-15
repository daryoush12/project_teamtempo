package com.teamtempo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.teamtempo.domain.Answer;

public class AnswerRowMapper implements RowMapper<Answer> {
	public Answer mapRow(ResultSet rs, int row) throws SQLException {
		Answer anw = new Answer();
		anw.setQuerie_detail_id(rs.getString("querie_detail_uuid"));
		anw.setAnswer_value(rs.getString("answer_value"));
//		anw.setRespondent_uuid(rs.getString("respondent_uuid"));
		return anw;
	}
}
