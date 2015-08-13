package com.vico.clever.cdr.service.model;

import java.util.Date;

public class ExamStatus {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.Guid
	 * @mbggenerated
	 */
	private String guid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.ActionDatetime
	 * @mbggenerated
	 */
	private Date actiondatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.Comment
	 * @mbggenerated
	 */
	private String comment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.EncounterIdentifier
	 * @mbggenerated
	 */
	private String encounteridentifier;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.ExaminationName
	 * @mbggenerated
	 */
	private String examinationname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.IsmTransition_CareflowStep_Code
	 * @mbggenerated
	 */
	private String ismtransitionCareflowstepCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.IsmTransition_CareflowStep_Name
	 * @mbggenerated
	 */
	private String ismtransitionCareflowstepName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.IsmTransition_CurrentState_Code
	 * @mbggenerated
	 */
	private String ismtransitionCurrentstateCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.IsmTransition_CurrentState_Name
	 * @mbggenerated
	 */
	private String ismtransitionCurrentstateName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.PatientIdentifier_Id
	 * @mbggenerated
	 */
	private String patientidentifierId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.Performer_Code
	 * @mbggenerated
	 */
	private String performerCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.Performer_Name
	 * @mbggenerated
	 */
	private String performerName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Action_ImagingExamination.RequesterOrderIdentifier
	 * @mbggenerated
	 */
	private String requesterorderidentifier;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.Guid
	 * @return  the value of Action_ImagingExamination.Guid
	 * @mbggenerated
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.Guid
	 * @param guid  the value for Action_ImagingExamination.Guid
	 * @mbggenerated
	 */
	public void setGuid(String guid) {
		this.guid = guid == null ? null : guid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.ActionDatetime
	 * @return  the value of Action_ImagingExamination.ActionDatetime
	 * @mbggenerated
	 */
	public Date getActiondatetime() {
		return actiondatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.ActionDatetime
	 * @param actiondatetime  the value for Action_ImagingExamination.ActionDatetime
	 * @mbggenerated
	 */
	public void setActiondatetime(Date actiondatetime) {
		this.actiondatetime = actiondatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.Comment
	 * @return  the value of Action_ImagingExamination.Comment
	 * @mbggenerated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.Comment
	 * @param comment  the value for Action_ImagingExamination.Comment
	 * @mbggenerated
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.EncounterIdentifier
	 * @return  the value of Action_ImagingExamination.EncounterIdentifier
	 * @mbggenerated
	 */
	public String getEncounteridentifier() {
		return encounteridentifier;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.EncounterIdentifier
	 * @param encounteridentifier  the value for Action_ImagingExamination.EncounterIdentifier
	 * @mbggenerated
	 */
	public void setEncounteridentifier(String encounteridentifier) {
		this.encounteridentifier = encounteridentifier == null ? null
				: encounteridentifier.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.ExaminationName
	 * @return  the value of Action_ImagingExamination.ExaminationName
	 * @mbggenerated
	 */
	public String getExaminationname() {
		return examinationname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.ExaminationName
	 * @param examinationname  the value for Action_ImagingExamination.ExaminationName
	 * @mbggenerated
	 */
	public void setExaminationname(String examinationname) {
		this.examinationname = examinationname == null ? null : examinationname
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.IsmTransition_CareflowStep_Code
	 * @return  the value of Action_ImagingExamination.IsmTransition_CareflowStep_Code
	 * @mbggenerated
	 */
	public String getIsmtransitionCareflowstepCode() {
		return ismtransitionCareflowstepCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.IsmTransition_CareflowStep_Code
	 * @param ismtransitionCareflowstepCode  the value for Action_ImagingExamination.IsmTransition_CareflowStep_Code
	 * @mbggenerated
	 */
	public void setIsmtransitionCareflowstepCode(
			String ismtransitionCareflowstepCode) {
		this.ismtransitionCareflowstepCode = ismtransitionCareflowstepCode == null ? null
				: ismtransitionCareflowstepCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.IsmTransition_CareflowStep_Name
	 * @return  the value of Action_ImagingExamination.IsmTransition_CareflowStep_Name
	 * @mbggenerated
	 */
	public String getIsmtransitionCareflowstepName() {
		return ismtransitionCareflowstepName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.IsmTransition_CareflowStep_Name
	 * @param ismtransitionCareflowstepName  the value for Action_ImagingExamination.IsmTransition_CareflowStep_Name
	 * @mbggenerated
	 */
	public void setIsmtransitionCareflowstepName(
			String ismtransitionCareflowstepName) {
		this.ismtransitionCareflowstepName = ismtransitionCareflowstepName == null ? null
				: ismtransitionCareflowstepName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.IsmTransition_CurrentState_Code
	 * @return  the value of Action_ImagingExamination.IsmTransition_CurrentState_Code
	 * @mbggenerated
	 */
	public String getIsmtransitionCurrentstateCode() {
		return ismtransitionCurrentstateCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.IsmTransition_CurrentState_Code
	 * @param ismtransitionCurrentstateCode  the value for Action_ImagingExamination.IsmTransition_CurrentState_Code
	 * @mbggenerated
	 */
	public void setIsmtransitionCurrentstateCode(
			String ismtransitionCurrentstateCode) {
		this.ismtransitionCurrentstateCode = ismtransitionCurrentstateCode == null ? null
				: ismtransitionCurrentstateCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.IsmTransition_CurrentState_Name
	 * @return  the value of Action_ImagingExamination.IsmTransition_CurrentState_Name
	 * @mbggenerated
	 */
	public String getIsmtransitionCurrentstateName() {
		return ismtransitionCurrentstateName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.IsmTransition_CurrentState_Name
	 * @param ismtransitionCurrentstateName  the value for Action_ImagingExamination.IsmTransition_CurrentState_Name
	 * @mbggenerated
	 */
	public void setIsmtransitionCurrentstateName(
			String ismtransitionCurrentstateName) {
		this.ismtransitionCurrentstateName = ismtransitionCurrentstateName == null ? null
				: ismtransitionCurrentstateName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.PatientIdentifier_Id
	 * @return  the value of Action_ImagingExamination.PatientIdentifier_Id
	 * @mbggenerated
	 */
	public String getPatientidentifierId() {
		return patientidentifierId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.PatientIdentifier_Id
	 * @param patientidentifierId  the value for Action_ImagingExamination.PatientIdentifier_Id
	 * @mbggenerated
	 */
	public void setPatientidentifierId(String patientidentifierId) {
		this.patientidentifierId = patientidentifierId == null ? null
				: patientidentifierId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.Performer_Code
	 * @return  the value of Action_ImagingExamination.Performer_Code
	 * @mbggenerated
	 */
	public String getPerformerCode() {
		return performerCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.Performer_Code
	 * @param performerCode  the value for Action_ImagingExamination.Performer_Code
	 * @mbggenerated
	 */
	public void setPerformerCode(String performerCode) {
		this.performerCode = performerCode == null ? null : performerCode
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.Performer_Name
	 * @return  the value of Action_ImagingExamination.Performer_Name
	 * @mbggenerated
	 */
	public String getPerformerName() {
		return performerName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.Performer_Name
	 * @param performerName  the value for Action_ImagingExamination.Performer_Name
	 * @mbggenerated
	 */
	public void setPerformerName(String performerName) {
		this.performerName = performerName == null ? null : performerName
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Action_ImagingExamination.RequesterOrderIdentifier
	 * @return  the value of Action_ImagingExamination.RequesterOrderIdentifier
	 * @mbggenerated
	 */
	public String getRequesterorderidentifier() {
		return requesterorderidentifier;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Action_ImagingExamination.RequesterOrderIdentifier
	 * @param requesterorderidentifier  the value for Action_ImagingExamination.RequesterOrderIdentifier
	 * @mbggenerated
	 */
	public void setRequesterorderidentifier(String requesterorderidentifier) {
		this.requesterorderidentifier = requesterorderidentifier == null ? null
				: requesterorderidentifier.trim();
	}
}