package infinity.learn.restservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import infinity.learn.restservices.modal.Questions;
import infinity.learn.restservices.modal.TempQuestions;
import infinity.learn.restservices.service.QuestonsServiceImpl;
import infinity.learn.restservices.service.TempQuestonsServiceImpl;



@RestController
@RequestMapping("/questions")
public class QuestionRestController {
	
	
	@Autowired
	QuestonsServiceImpl questonsServiceImpl;
	
	@Autowired
	TempQuestonsServiceImpl tempQuestonsServiceImpl;
	
	

    	
	
	@GetMapping(value = "/{questionId}")
    public ResponseEntity<?> getTestScheduleQuestion(@PathVariable("questionId") Integer questionId) {
		TempQuestions tempQuestion=tempQuestonsServiceImpl.getQuestionInfo();
        return new ResponseEntity<>(tempQuestion, HttpStatus.OK);
    }
	
	
	@GetMapping(value = "/questionJson")
    public ResponseEntity<?> getQuestionJson() {
		Questions question=questonsServiceImpl.getQuestionInfo();
        return new ResponseEntity<>(question, HttpStatus.OK);
    }
	
	
  

}
