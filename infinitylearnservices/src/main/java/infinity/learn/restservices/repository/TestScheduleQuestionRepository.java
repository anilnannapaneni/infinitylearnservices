package infinity.learn.restservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import infinity.learn.restservices.modal.TestScheduleQuestion;

@Repository

public interface TestScheduleQuestionRepository extends MongoRepository<TestScheduleQuestion, String> {


	//@Query("{ 'QUESTIONID' : ?0 }")
	TestScheduleQuestion findByQuestionid(Integer questionId);


}

