package com.teamtempo.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.teamtempo.domain.Answer;

@Repository
public class AnswerDAO {
	
	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Answer> getAll(String uuid) {
		
		String sql = "SELECT * FROM java_querie_to_answer WHERE querie_detail_uuid = ?";
		Object[] parametrit = new Object[] { uuid };
		RowMapper<Answer> mapper = new AnswerRowMapper();
		try { 
			List<Answer> querieAnswers = jdbcTemplate.query(sql,parametrit,mapper);
			return querieAnswers;
		    } catch(IncorrectResultSizeDataAccessException e) {
		    	throw new AnswerException(e);
		    }
		}
	
	public void SaveAnswers(List<Answer> newanswers){
		//Eka looppi jossa lis‰t‰‰n saatu respondent id:
		//Toinen looppi jossa lis‰t‰‰n uudet vastaukset:
	}
	}

