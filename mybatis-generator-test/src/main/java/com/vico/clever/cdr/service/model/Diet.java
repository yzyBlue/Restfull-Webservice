package com.vico.clever.cdr.service.model;

import java.util.Date;

public class Diet {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.Guid
     *
     * @mbggenerated
     */
    private String guid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.Administration_Code
     *
     * @mbggenerated
     */
    private String administrationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.Administration_Name
     *
     * @mbggenerated
     */
    private String administrationName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.DietContent
     *
     * @mbggenerated
     */
    private String dietcontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.DietIdentifier
     *
     * @mbggenerated
     */
    private String dietidentifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.DosageUnit
     *
     * @mbggenerated
     */
    private String dosageunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.Dosage
     *
     * @mbggenerated
     */
    private String dosage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.EncounterIdentifier
     *
     * @mbggenerated
     */
    private String encounteridentifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.FrequencyCount
     *
     * @mbggenerated
     */
    private Integer frequencycount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.FrequencyDescription
     *
     * @mbggenerated
     */
    private String frequencydescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.FrequencyIntervalUnit
     *
     * @mbggenerated
     */
    private String frequencyintervalunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.FrequencyInterval
     *
     * @mbggenerated
     */
    private Integer frequencyinterval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.Memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.OrderIdentifier
     *
     * @mbggenerated
     */
    private String orderidentifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.PatientIdentifier_Id
     *
     * @mbggenerated
     */
    private String patientidentifierId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.PlannedExecDatetime
     *
     * @mbggenerated
     */
    private Date plannedexecdatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Inst_Diet.PlannedStopDatetime
     *
     * @mbggenerated
     */
    private Date plannedstopdatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.Guid
     *
     * @return the value of Inst_Diet.Guid
     *
     * @mbggenerated
     */
    public String getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.Guid
     *
     * @param guid the value for Inst_Diet.Guid
     *
     * @mbggenerated
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.Administration_Code
     *
     * @return the value of Inst_Diet.Administration_Code
     *
     * @mbggenerated
     */
    public String getAdministrationCode() {
        return administrationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.Administration_Code
     *
     * @param administrationCode the value for Inst_Diet.Administration_Code
     *
     * @mbggenerated
     */
    public void setAdministrationCode(String administrationCode) {
        this.administrationCode = administrationCode == null ? null : administrationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.Administration_Name
     *
     * @return the value of Inst_Diet.Administration_Name
     *
     * @mbggenerated
     */
    public String getAdministrationName() {
        return administrationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.Administration_Name
     *
     * @param administrationName the value for Inst_Diet.Administration_Name
     *
     * @mbggenerated
     */
    public void setAdministrationName(String administrationName) {
        this.administrationName = administrationName == null ? null : administrationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.DietContent
     *
     * @return the value of Inst_Diet.DietContent
     *
     * @mbggenerated
     */
    public String getDietcontent() {
        return dietcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.DietContent
     *
     * @param dietcontent the value for Inst_Diet.DietContent
     *
     * @mbggenerated
     */
    public void setDietcontent(String dietcontent) {
        this.dietcontent = dietcontent == null ? null : dietcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.DietIdentifier
     *
     * @return the value of Inst_Diet.DietIdentifier
     *
     * @mbggenerated
     */
    public String getDietidentifier() {
        return dietidentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.DietIdentifier
     *
     * @param dietidentifier the value for Inst_Diet.DietIdentifier
     *
     * @mbggenerated
     */
    public void setDietidentifier(String dietidentifier) {
        this.dietidentifier = dietidentifier == null ? null : dietidentifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.DosageUnit
     *
     * @return the value of Inst_Diet.DosageUnit
     *
     * @mbggenerated
     */
    public String getDosageunit() {
        return dosageunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.DosageUnit
     *
     * @param dosageunit the value for Inst_Diet.DosageUnit
     *
     * @mbggenerated
     */
    public void setDosageunit(String dosageunit) {
        this.dosageunit = dosageunit == null ? null : dosageunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.Dosage
     *
     * @return the value of Inst_Diet.Dosage
     *
     * @mbggenerated
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.Dosage
     *
     * @param dosage the value for Inst_Diet.Dosage
     *
     * @mbggenerated
     */
    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.EncounterIdentifier
     *
     * @return the value of Inst_Diet.EncounterIdentifier
     *
     * @mbggenerated
     */
    public String getEncounteridentifier() {
        return encounteridentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.EncounterIdentifier
     *
     * @param encounteridentifier the value for Inst_Diet.EncounterIdentifier
     *
     * @mbggenerated
     */
    public void setEncounteridentifier(String encounteridentifier) {
        this.encounteridentifier = encounteridentifier == null ? null : encounteridentifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.FrequencyCount
     *
     * @return the value of Inst_Diet.FrequencyCount
     *
     * @mbggenerated
     */
    public Integer getFrequencycount() {
        return frequencycount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.FrequencyCount
     *
     * @param frequencycount the value for Inst_Diet.FrequencyCount
     *
     * @mbggenerated
     */
    public void setFrequencycount(Integer frequencycount) {
        this.frequencycount = frequencycount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.FrequencyDescription
     *
     * @return the value of Inst_Diet.FrequencyDescription
     *
     * @mbggenerated
     */
    public String getFrequencydescription() {
        return frequencydescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.FrequencyDescription
     *
     * @param frequencydescription the value for Inst_Diet.FrequencyDescription
     *
     * @mbggenerated
     */
    public void setFrequencydescription(String frequencydescription) {
        this.frequencydescription = frequencydescription == null ? null : frequencydescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.FrequencyIntervalUnit
     *
     * @return the value of Inst_Diet.FrequencyIntervalUnit
     *
     * @mbggenerated
     */
    public String getFrequencyintervalunit() {
        return frequencyintervalunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.FrequencyIntervalUnit
     *
     * @param frequencyintervalunit the value for Inst_Diet.FrequencyIntervalUnit
     *
     * @mbggenerated
     */
    public void setFrequencyintervalunit(String frequencyintervalunit) {
        this.frequencyintervalunit = frequencyintervalunit == null ? null : frequencyintervalunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.FrequencyInterval
     *
     * @return the value of Inst_Diet.FrequencyInterval
     *
     * @mbggenerated
     */
    public Integer getFrequencyinterval() {
        return frequencyinterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.FrequencyInterval
     *
     * @param frequencyinterval the value for Inst_Diet.FrequencyInterval
     *
     * @mbggenerated
     */
    public void setFrequencyinterval(Integer frequencyinterval) {
        this.frequencyinterval = frequencyinterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.Memo
     *
     * @return the value of Inst_Diet.Memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.Memo
     *
     * @param memo the value for Inst_Diet.Memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.OrderIdentifier
     *
     * @return the value of Inst_Diet.OrderIdentifier
     *
     * @mbggenerated
     */
    public String getOrderidentifier() {
        return orderidentifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.OrderIdentifier
     *
     * @param orderidentifier the value for Inst_Diet.OrderIdentifier
     *
     * @mbggenerated
     */
    public void setOrderidentifier(String orderidentifier) {
        this.orderidentifier = orderidentifier == null ? null : orderidentifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.PatientIdentifier_Id
     *
     * @return the value of Inst_Diet.PatientIdentifier_Id
     *
     * @mbggenerated
     */
    public String getPatientidentifierId() {
        return patientidentifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.PatientIdentifier_Id
     *
     * @param patientidentifierId the value for Inst_Diet.PatientIdentifier_Id
     *
     * @mbggenerated
     */
    public void setPatientidentifierId(String patientidentifierId) {
        this.patientidentifierId = patientidentifierId == null ? null : patientidentifierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.PlannedExecDatetime
     *
     * @return the value of Inst_Diet.PlannedExecDatetime
     *
     * @mbggenerated
     */
    public Date getPlannedexecdatetime() {
        return plannedexecdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.PlannedExecDatetime
     *
     * @param plannedexecdatetime the value for Inst_Diet.PlannedExecDatetime
     *
     * @mbggenerated
     */
    public void setPlannedexecdatetime(Date plannedexecdatetime) {
        this.plannedexecdatetime = plannedexecdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Inst_Diet.PlannedStopDatetime
     *
     * @return the value of Inst_Diet.PlannedStopDatetime
     *
     * @mbggenerated
     */
    public Date getPlannedstopdatetime() {
        return plannedstopdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Inst_Diet.PlannedStopDatetime
     *
     * @param plannedstopdatetime the value for Inst_Diet.PlannedStopDatetime
     *
     * @mbggenerated
     */
    public void setPlannedstopdatetime(Date plannedstopdatetime) {
        this.plannedstopdatetime = plannedstopdatetime;
    }
}