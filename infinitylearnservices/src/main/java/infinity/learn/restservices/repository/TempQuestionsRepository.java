package infinity.learn.restservices.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import infinity.learn.restservices.modal.TempQuestions;

@Repository
public interface TempQuestionsRepository extends MongoRepository<TempQuestions, String> {

	List<TempQuestions> findByIsActive(boolean b);




}

