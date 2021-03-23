/**
 * 
 */
package infinity.learn.restservices.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tempQuestions")
public class QPrevious{

	@Id
	private Object _id;
	
	public String qPreviousType;
	
	public String[] qPreviousYears;
	
	public String createdBy;
	
	public String modifiedBy;
	
	public String creationDTS;
	
	public String modifiedDTS;
	
	public boolean isActive;

	public Object get_id() {
		return _id;
	}

	public void set_id(Object _id) {
		this._id = _id;
	}

	public String getqPreviousType() {
		return qPreviousType;
	}

	public void setqPreviousType(String qPreviousType) {
		this.qPreviousType = qPreviousType;
	}

	public String[] getqPreviousYears() {
		return qPreviousYears;
	}

	public void setqPreviousYears(String[] qPreviousYears) {
		this.qPreviousYears = qPreviousYears;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getCreationDTS() {
		return creationDTS;
	}

	public void setCreationDTS(String creationDTS) {
		this.creationDTS = creationDTS;
	}

	public String getModifiedDTS() {
		return modifiedDTS;
	}

	public void setModifiedDTS(String modifiedDTS) {
		this.modifiedDTS = modifiedDTS;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	

}
