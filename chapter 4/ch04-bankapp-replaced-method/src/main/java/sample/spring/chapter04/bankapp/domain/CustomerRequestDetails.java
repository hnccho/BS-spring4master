package sample.spring.chapter04.bankapp.domain;

import java.util.Date;

import org.apache.log4j.Logger;

public class CustomerRequestDetails {
	
	private static Logger logger = Logger.getLogger(CustomerRequestDetails.class);

	private String type;
	private String description;
	private String category;
	private String assignedDepartment;
	private Date submissionDate;
	private String status;
	private String resolutionTimeInDays;

	public CustomerRequestDetails() {
		logger.info("Created CustomerRequestDetails instance");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAssignedDepartment() {
		return assignedDepartment;
	}

	public void setAssignedDepartment(String assignedDepartment) {
		this.assignedDepartment = assignedDepartment;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResolutionTimeInDays() {
		return resolutionTimeInDays;
	}

	public void setResolutionTimeInDays(String resolutionTimeInDays) {
		this.resolutionTimeInDays = resolutionTimeInDays;
	}
	
}
