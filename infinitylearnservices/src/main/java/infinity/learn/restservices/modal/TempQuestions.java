/**
 * 
 */
package infinity.learn.restservices.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tempQuestions")
public class TempQuestions {
	
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	private Object _id;
	
	public String[] hint;
	public String[] qPrevious;
	public String[] testConceptLevel;
	public String[] solutionConcepts;
	public Options[] options;
	
	public String question;
	public String solution;
	public String qTypeCode;
	public Integer qMarks;
	
	public String qStandard;
	public String qRelevance;
	public String subjectIndex;
	public String syllabus;
	public String reference;
	public String contentDataId;
	public String parentId;
	public String contentMatrixId;
	public String qStatus;
	public String qLevel;
	public String creationDTS;
	
	public String[] mapList;
	public Integer __v;
	
	public String modifiedBy;
	public String modifiedDTS;
	public String reviewerId;
	public String lastComment;
	public String writerId;
	public String[] explanation;
	public String sourceReference;
	public boolean isActive;
	public boolean isMigrated;
	
	public Object get_id() {
		return _id;
	}
	public void set_id(Object _id) {
		this._id = _id;
	}
	public String[] getHint() {
		return hint;
	}
	public void setHint(String[] hint) {
		this.hint = hint;
	}
	
	
	public String[] getqPrevious() {
		return qPrevious;
	}
	public void setqPrevious(String[] qPrevious) {
		this.qPrevious = qPrevious;
	}
	public String[] getTestConceptLevel() {
		return testConceptLevel;
	}
	public void setTestConceptLevel(String[] testConceptLevel) {
		this.testConceptLevel = testConceptLevel;
	}
	public String[] getSolutionConcepts() {
		return solutionConcepts;
	}
	public void setSolutionConcepts(String[] solutionConcepts) {
		this.solutionConcepts = solutionConcepts;
	}
	public Options[] getOptions() {
		return options;
	}
	public void setOptions(Options[] options) {
		this.options = options;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getqTypeCode() {
		return qTypeCode;
	}
	public void setqTypeCode(String qTypeCode) {
		this.qTypeCode = qTypeCode;
	}
	public Integer getqMarks() {
		return qMarks;
	}
	public void setqMarks(Integer qMarks) {
		this.qMarks = qMarks;
	}
	public String getqStandard() {
		return qStandard;
	}
	public void setqStandard(String qStandard) {
		this.qStandard = qStandard;
	}
	public String getqRelevance() {
		return qRelevance;
	}
	public void setqRelevance(String qRelevance) {
		this.qRelevance = qRelevance;
	}
	public String getSubjectIndex() {
		return subjectIndex;
	}
	public void setSubjectIndex(String subjectIndex) {
		this.subjectIndex = subjectIndex;
	}
	public String getSyllabus() {
		return syllabus;
	}
	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getContentDataId() {
		return contentDataId;
	}
	public void setContentDataId(String contentDataId) {
		this.contentDataId = contentDataId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getContentMatrixId() {
		return contentMatrixId;
	}
	public void setContentMatrixId(String contentMatrixId) {
		this.contentMatrixId = contentMatrixId;
	}
	public String getqStatus() {
		return qStatus;
	}
	public void setqStatus(String qStatus) {
		this.qStatus = qStatus;
	}
	public String getqLevel() {
		return qLevel;
	}
	public void setqLevel(String qLevel) {
		this.qLevel = qLevel;
	}
	public String getCreationDTS() {
		return creationDTS;
	}
	public void setCreationDTS(String creationDTS) {
		this.creationDTS = creationDTS;
	}
	public String[] getMapList() {
		return mapList;
	}
	public void setMapList(String[] mapList) {
		this.mapList = mapList;
	}
	public Integer get__v() {
		return __v;
	}
	public void set__v(Integer __v) {
		this.__v = __v;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedDTS() {
		return modifiedDTS;
	}
	public void setModifiedDTS(String modifiedDTS) {
		this.modifiedDTS = modifiedDTS;
	}
	public String getReviewerId() {
		return reviewerId;
	}
	public void setReviewerId(String reviewerId) {
		this.reviewerId = reviewerId;
	}
	public String getLastComment() {
		return lastComment;
	}
	public void setLastComment(String lastComment) {
		this.lastComment = lastComment;
	}
	public String[] getExplanation() {
		return explanation;
	}
	public void setExplanation(String[] explanation) {
		this.explanation = explanation;
	}
	public String getSourceReference() {
		return sourceReference;
	}
	public void setSourceReference(String sourceReference) {
		this.sourceReference = sourceReference;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isMigrated() {
		return isMigrated;
	}
	public void setMigrated(boolean isMigrated) {
		this.isMigrated = isMigrated;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	

}
