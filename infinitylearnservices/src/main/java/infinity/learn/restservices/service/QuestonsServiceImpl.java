package infinity.learn.restservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infinity.learn.restservices.modal.Questions;
import infinity.learn.restservices.repository.QuestionsRepository;

@Service
public class QuestonsServiceImpl implements QuestonsService {
	
	@Autowired
	QuestionsRepository questionsRepository;

	@Override
	public Questions getQuestionInfo() {
		List<Questions> questions=questionsRepository.findByIsActive(true);
		if(questions!=null && questions.size()>0) {
			return questions.get(10);
		}else {
			return null;
		}
	}
	

}
