package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.PrescriptionDetail;

public interface PrescriptionDetailMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Prescription_PrescriptionDetails
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Prescription_PrescriptionDetails
	 * @mbggenerated
	 */
	int insert(PrescriptionDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Prescription_PrescriptionDetails
	 * @mbggenerated
	 */
	int insertSelective(PrescriptionDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Prescription_PrescriptionDetails
	 * @mbggenerated
	 */
	PrescriptionDetail selectByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Prescription_PrescriptionDetails
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(PrescriptionDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Prescription_PrescriptionDetails
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PrescriptionDetail record);
}