package com.teamtempo.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.teamtempo.dao.AnswerDAO;
import com.teamtempo.dao.QuestionDAO;
import com.teamtempo.dao.RespondentDAO;
import com.teamtempo.dao.ResponseDAO;
import com.teamtempo.dao.SurveyDAO;
import com.teamtempo.domain.Answer;
import com.teamtempo.domain.Question;
import com.teamtempo.domain.Response;
import com.teamtempo.domain.Survey;

@RestController
@RequestMapping(value="api")
public class ServiceController {
	@Autowired
	SurveyDAO surv;
	@Autowired
	AnswerDAO anw;
	@Autowired
	QuestionDAO que;
	@Autowired 
	RespondentDAO rd;
	@Autowired 
	ResponseDAO rpd;
	
	//Kaikki kyselyt:
	@RequestMapping(value="/surveys")
	public List<Survey>returnAllSurveysJSON() {
		List<Survey> surveys = surv.getAll();
	    return surveys;
	}
	
	@RequestMapping(value="/survey/newresponse", method = RequestMethod.POST, consumes ="application/json",produces = "application/json")
	public String Respond(@RequestBody Response resp)throws Exception {
		if(resp != null){
			return "OK"+" \n"+resp.getQuerie_uuid()+"  "+resp.getAnswers().size();
			
		}
		else
			return "FAIL";

	}
	
	//Tietty kysely + Siihen liittyvät kysymykset:
	@RequestMapping(value="/surveys/{uuid}")
	public Survey returnOneSurveyJSON(@PathVariable("uuid") String uuid) {
		Survey survey = surv.getOne(uuid);
	    return survey;
	}
	
	//Tietyn kyselyn vastaukset(KAIKKI):
	@RequestMapping(value="surveys/answers/{uuid}")
	public List<Answer>returnSurveyAnswersJSON(@PathVariable("uuid") String uuid){
		List<Answer> answers = anw.getAll(uuid);
		return answers;
	}
	
	//Tietyn Kyselyn Kysymykset(KAIKKI):
	@RequestMapping(value="surveys/questions/{uuid}")
	public List<Question>returnSurveyQuestionsJSON(@PathVariable("uuid") String uuid){
		List<Question> questions = que.SearchByuuid(uuid);
		return questions;
	}
	
//	@RequestMapping("surveys/question/")
//	public Question returnQuestionJSON(){
//		
//	}
	
	
	@RequestMapping(value="/status", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> statustest() {
	   String Whatisit = "Hello world";
	   return ResponseEntity.ok(Whatisit);
	}
	
}