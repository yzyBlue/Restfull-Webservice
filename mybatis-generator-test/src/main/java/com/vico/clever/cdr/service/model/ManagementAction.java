package com.vico.clever.cdr.service.model;

import java.util.Date;

public class ManagementAction {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.Guid
     *
     * @mbggenerated
     */
    private String guid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.ActionDatetime
     *
     * @mbggenerated
     */
    private Date actiondatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.EncounterIdentifier
     *
     * @mbggenerated
     */
    private String encounteridentifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.IsmTransition_CareflowStep_Code
     *
     * @mbggenerated
     */
    private String ismtransitionCareflowstepCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.IsmTransition_CareflowStep_Name
     *
     * @mbggenerated
     */
    private String ismtransitionCareflowstepName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.IsmTransition_CurrentState_Code
     *
     * @mbggenerated
     */
    private String ismtransitionCurrentstateCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.IsmTransition_CurrentState_Name
     *
     * @mbggenerated
     */
    private String ismtransitionCurrentstateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.ManagementContent
     *
     * @mbggenerated
     */
    private String managementcontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.Memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.PatientIdentifier_Id
     *
     * @mbggenerated
     */
    private String patientidentifierId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.PerformDepartment_Code
     *
     * @mbggenerated
     */
    private String performdepartmentCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.PerformDepartment_Name
     *
     * @mbggenerated
     */
    private String performdepartmentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.Performer_Code
     *
     * @mbggenerated
     */
    private String performerCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.Performer_Name
     *
     * @mbggenerated
     */
    private String performerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Action_Management.ManagementIdentifier
     *
     * @mbggenerated
     */
    private String managementidentifier;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.Guid
     *
     * @return the value of Action_Management.Guid
     *
     * @mbggenerated
     */
    public String getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.Guid
     *
     * @param guid the value for Action_Management.Guid
     *
     * @mbggenerated
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.ActionDatetime
     *
     * @return the value of Action_Management.ActionDatetime
     *
     * @mbggenerated
     */
    public Date getActiondatetime() {
        return actiondatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.ActionDatetime
     *
     * @param actiondatetime the value for Action_Management.ActionDatetime
     *
     * @mbggenerated
     */
    public void setActiondatetime(Date actiondatetime) {
        this.actiondatetime = actiondatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.EncounterIdentifier
     *
     * @return the value of Action_Management.EncounterIdentifier
     *
     * @mbggenerated
     */
    public String getEncounteridentifier() {
        return encounteridentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.EncounterIdentifier
     *
     * @param encounteridentifier the value for Action_Management.EncounterIdentifier
     *
     * @mbggenerated
     */
    public void setEncounteridentifier(String encounteridentifier) {
        this.encounteridentifier = encounteridentifier == null ? null : encounteridentifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.IsmTransition_CareflowStep_Code
     *
     * @return the value of Action_Management.IsmTransition_CareflowStep_Code
     *
     * @mbggenerated
     */
    public String getIsmtransitionCareflowstepCode() {
        return ismtransitionCareflowstepCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.IsmTransition_CareflowStep_Code
     *
     * @param ismtransitionCareflowstepCode the value for Action_Management.IsmTransition_CareflowStep_Code
     *
     * @mbggenerated
     */
    public void setIsmtransitionCareflowstepCode(String ismtransitionCareflowstepCode) {
        this.ismtransitionCareflowstepCode = ismtransitionCareflowstepCode == null ? null : ismtransitionCareflowstepCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.IsmTransition_CareflowStep_Name
     *
     * @return the value of Action_Management.IsmTransition_CareflowStep_Name
     *
     * @mbggenerated
     */
    public String getIsmtransitionCareflowstepName() {
        return ismtransitionCareflowstepName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.IsmTransition_CareflowStep_Name
     *
     * @param ismtransitionCareflowstepName the value for Action_Management.IsmTransition_CareflowStep_Name
     *
     * @mbggenerated
     */
    public void setIsmtransitionCareflowstepName(String ismtransitionCareflowstepName) {
        this.ismtransitionCareflowstepName = ismtransitionCareflowstepName == null ? null : ismtransitionCareflowstepName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.IsmTransition_CurrentState_Code
     *
     * @return the value of Action_Management.IsmTransition_CurrentState_Code
     *
     * @mbggenerated
     */
    public String getIsmtransitionCurrentstateCode() {
        return ismtransitionCurrentstateCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.IsmTransition_CurrentState_Code
     *
     * @param ismtransitionCurrentstateCode the value for Action_Management.IsmTransition_CurrentState_Code
     *
     * @mbggenerated
     */
    public void setIsmtransitionCurrentstateCode(String ismtransitionCurrentstateCode) {
        this.ismtransitionCurrentstateCode = ismtransitionCurrentstateCode == null ? null : ismtransitionCurrentstateCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.IsmTransition_CurrentState_Name
     *
     * @return the value of Action_Management.IsmTransition_CurrentState_Name
     *
     * @mbggenerated
     */
    public String getIsmtransitionCurrentstateName() {
        return ismtransitionCurrentstateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.IsmTransition_CurrentState_Name
     *
     * @param ismtransitionCurrentstateName the value for Action_Management.IsmTransition_CurrentState_Name
     *
     * @mbggenerated
     */
    public void setIsmtransitionCurrentstateName(String ismtransitionCurrentstateName) {
        this.ismtransitionCurrentstateName = ismtransitionCurrentstateName == null ? null : ismtransitionCurrentstateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.ManagementContent
     *
     * @return the value of Action_Management.ManagementContent
     *
     * @mbggenerated
     */
    public String getManagementcontent() {
        return managementcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.ManagementContent
     *
     * @param managementcontent the value for Action_Management.ManagementContent
     *
     * @mbggenerated
     */
    public void setManagementcontent(String managementcontent) {
        this.managementcontent = managementcontent == null ? null : managementcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.Memo
     *
     * @return the value of Action_Management.Memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.Memo
     *
     * @param memo the value for Action_Management.Memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.PatientIdentifier_Id
     *
     * @return the value of Action_Management.PatientIdentifier_Id
     *
     * @mbggenerated
     */
    public String getPatientidentifierId() {
        return patientidentifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.PatientIdentifier_Id
     *
     * @param patientidentifierId the value for Action_Management.PatientIdentifier_Id
     *
     * @mbggenerated
     */
    public void setPatientidentifierId(String patientidentifierId) {
        this.patientidentifierId = patientidentifierId == null ? null : patientidentifierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.PerformDepartment_Code
     *
     * @return the value of Action_Management.PerformDepartment_Code
     *
     * @mbggenerated
     */
    public String getPerformdepartmentCode() {
        return performdepartmentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.PerformDepartment_Code
     *
     * @param performdepartmentCode the value for Action_Management.PerformDepartment_Code
     *
     * @mbggenerated
     */
    public void setPerformdepartmentCode(String performdepartmentCode) {
        this.performdepartmentCode = performdepartmentCode == null ? null : performdepartmentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.PerformDepartment_Name
     *
     * @return the value of Action_Management.PerformDepartment_Name
     *
     * @mbggenerated
     */
    public String getPerformdepartmentName() {
        return performdepartmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.PerformDepartment_Name
     *
     * @param performdepartmentName the value for Action_Management.PerformDepartment_Name
     *
     * @mbggenerated
     */
    public void setPerformdepartmentName(String performdepartmentName) {
        this.performdepartmentName = performdepartmentName == null ? null : performdepartmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.Performer_Code
     *
     * @return the value of Action_Management.Performer_Code
     *
     * @mbggenerated
     */
    public String getPerformerCode() {
        return performerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.Performer_Code
     *
     * @param performerCode the value for Action_Management.Performer_Code
     *
     * @mbggenerated
     */
    public void setPerformerCode(String performerCode) {
        this.performerCode = performerCode == null ? null : performerCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.Performer_Name
     *
     * @return the value of Action_Management.Performer_Name
     *
     * @mbggenerated
     */
    public String getPerformerName() {
        return performerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.Performer_Name
     *
     * @param performerName the value for Action_Management.Performer_Name
     *
     * @mbggenerated
     */
    public void setPerformerName(String performerName) {
        this.performerName = performerName == null ? null : performerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Action_Management.ManagementIdentifier
     *
     * @return the value of Action_Management.ManagementIdentifier
     *
     * @mbggenerated
     */
    public String getManagementidentifier() {
        return managementidentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Action_Management.ManagementIdentifier
     *
     * @param managementidentifier the value for Action_Management.ManagementIdentifier
     *
     * @mbggenerated
     */
    public void setManagementidentifier(String managementidentifier) {
        this.managementidentifier = managementidentifier == null ? null : managementidentifier.trim();
    }
}