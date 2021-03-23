package infinity.learn.restservices.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import infinity.learn.restservices.modal.Questions;

@Repository
public interface QuestionsRepository extends MongoRepository<Questions, String> {

	List<Questions> findByIsActive(boolean b);




}

