package com.teamtempo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.teamtempo.domain.Question;

public class QuestionRowMapper implements RowMapper<Question> {
	public Question mapRow(ResultSet rs, int row) throws SQLException {
		Question que = new Question();
		que.setQuerie_detail_uuid(rs.getString("querie_detail_uuid"));
		que.setInquiry(rs.getString("inquiry"));
		que.setContext(rs.getString("context"));
		que.setType(rs.getString("type"));
		que.setStyle(rs.getString("style"));
		que.setQuerie_ordinal(rs.getString("querie_ordinal"));
		que.setQuerie_detail_serial(rs.getString("querie_detail_serial"));
		que.setOption(rs.getString("option"));
		que.setRequired(rs.getString("required"));
		return que;
	}
}
