package com.teamtempo.dao;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.teamtempo.domain.Respondent;
import com.teamtempo.domain.Survey;
@Repository
public class RespondentDAO {
	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public String NewRespondent(){
		String sql = "SELECT `new_respondent`() AS `new_respondent`";
		RowMapper<Respondent> mapper = new RespondentRowMapper();
	    Respondent r;
	    try { 
	    r = jdbcTemplate.queryForObject(sql, mapper);
	    } catch(IncorrectResultSizeDataAccessException e) {
	    	throw new SurveyException(e);
	    }
	    return r.getRespondent_uuid();
	}	
}
