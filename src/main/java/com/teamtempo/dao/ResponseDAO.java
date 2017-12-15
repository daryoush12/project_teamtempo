package com.teamtempo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.teamtempo.domain.Answer;
import com.teamtempo.domain.Response;

@Repository
public class ResponseDAO {
	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	int calc;
	public boolean Save(Response r) {
		try{
			final String sql = "CALL `add_one_answer`(?,?,?,?)";
			final String querie_uuid = r.getQuerie_uuid();
			final String respondent_uuid = r.getRespondent_uuid();
			final List<Answer> answers = r.getAnswers();
			//Loop
		    for (calc = 0; calc < answers.size(); calc++){	
		    	jdbcTemplate.update(
			    	    new PreparedStatementCreator() {
			    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
			    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
			    	            ps.setString(1, querie_uuid);
			    	            ps.setString(2, respondent_uuid);
			    	            ps.setString(3, answers.get(calc).getQuerie_detail_id());
			    	            ps.setString(4, answers.get(calc).getAnswer_value());
			    	            return ps;
			    	        }
			    	    });	
		    }
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	
}
