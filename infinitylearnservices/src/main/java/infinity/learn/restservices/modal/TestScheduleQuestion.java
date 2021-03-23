package infinity.learn.restservices.modal;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TestScheduleQuestion")
public class TestScheduleQuestion {

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	@BsonProperty(value = "_ID")
	private Integer id;

	@BsonProperty(value = "QUESTIONID")
	private Integer questionid;

	@BsonProperty(value = "QUESTION")
	private String QUESTION;

	@BsonProperty(value = "SCHEDULEID")
	private Integer SCHEDULEID;

	public TestScheduleQuestion() {
	}

	public TestScheduleQuestion(Integer question_Id, String question, Integer schedule_id) {
		this.questionid = question_Id;
		this.QUESTION = question;
		this.SCHEDULEID = schedule_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuestionid() {
		return questionid;
	}

	public void setQuestionid(Integer questionid) {
		this.questionid = questionid;
	}

	

	public String getQUESTION() {
		return QUESTION;
	}

	public void setQUESTION(String qUESTION) {
		QUESTION = qUESTION;
	}

	public Integer getSCHEDULEID() {
		return SCHEDULEID;
	}

	public void setSCHEDULEID(Integer sCHEDULEID) {
		SCHEDULEID = sCHEDULEID;
	}

	@Override
	public String toString() {
		return "question{" + "questionId='" + questionid + '\'' + ", question=" + QUESTION + ", schedule_id='"
				+ SCHEDULEID + '}';
	}
}
