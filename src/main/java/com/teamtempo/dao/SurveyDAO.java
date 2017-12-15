package com.teamtempo.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.teamtempo.domain.Survey;


@Repository
public class SurveyDAO {
	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Autowired
	QuestionDAO que;
		
public List<Survey> getAll() {
		
		String sql = "SELECT querie_uuid FROM java_querie";
		RowMapper<Survey> mapper = new SurveyRowMapper();
		try { 
			List<Survey> Surveys = jdbcTemplate.query(sql,mapper);
			for(int i = 0; i < Surveys.size(); i++){
				Surveys.get(i).setQuerie_detail(que.SearchByuuid(Surveys.get(i).getQuerie_uuid()));
				
				
				
				System.out.println("SIZE: "+Surveys.get(i).getQuerie_detail().size());
			}
			return Surveys;
		    } catch(IncorrectResultSizeDataAccessException e) {
		    	throw new AnswerException(e);
		    }
		}


public Survey getOne (String uuids) {
	String sql = "SELECT querie_uuid FROM `java_querie` WHERE querie_uuid = ?";
	Object[] parametrit = new Object[] { uuids };
	RowMapper<Survey> mapper = new SurveyRowMapper();
    Survey s;
    try { 
    s = jdbcTemplate.queryForObject(sql , parametrit, mapper);
    s.setQuerie_detail(que.SearchByuuid(uuids));
    } catch(IncorrectResultSizeDataAccessException e) {
    	throw new SurveyException(e);
    }
    return s;
}		
}


