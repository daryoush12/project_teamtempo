package com.teamtempo.dao;

import java.util.List;
import javax.inject.Inject;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.teamtempo.domain.Question;

@Repository
public class QuestionDAO {
	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Question> SearchByuuid (String uuid) {
		String sql = "SELECT querie_detail_uuid,inquiry,context,type,style,querie_ordinal,querie_detail_serial,required,option FROM java_querie_to_detail_type WHERE querie_uuid = ?";
		Object[] parametrit = new Object[] { uuid };
		RowMapper<Question> mapper = new QuestionRowMapper();
	    try { 
	    List<Question> questions = jdbcTemplate.query(sql , parametrit, mapper);
	    return questions;
	    } catch(IncorrectResultSizeDataAccessException e) {
	    	throw new QuestionException(e);
	    }
	}
}
