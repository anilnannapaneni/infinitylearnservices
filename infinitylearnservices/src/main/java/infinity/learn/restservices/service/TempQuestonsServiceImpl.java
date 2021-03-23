package infinity.learn.restservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinity.learn.restservices.modal.Questions;
import infinity.learn.restservices.modal.TempQuestions;
import infinity.learn.restservices.repository.QuestionsRepository;
import infinity.learn.restservices.repository.TempQuestionsRepository;

@Service
public class TempQuestonsServiceImpl implements TempQuestonsService {
	
	@Autowired
	TempQuestionsRepository tempQuestionsRepository;

	@Override
	public TempQuestions getQuestionInfo() {
		List<TempQuestions> questions=tempQuestionsRepository.findByIsActive(true);
		if(questions!=null && questions.size()>0) {
			return questions.get(0);
		}else {
			return null;
		}
	}
	

}
