package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.ExamReportInfo;

public interface ExamReportInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Obsr_ImagingExaminationReport
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Obsr_ImagingExaminationReport
	 * @mbggenerated
	 */
	int insert(ExamReportInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Obsr_ImagingExaminationReport
	 * @mbggenerated
	 */
	int insertSelective(ExamReportInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Obsr_ImagingExaminationReport
	 * @mbggenerated
	 */
	ExamReportInfo selectByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Obsr_ImagingExaminationReport
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ExamReportInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Obsr_ImagingExaminationReport
	 * @mbggenerated
	 */
	int updateByPrimaryKeyWithBLOBs(ExamReportInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Obsr_ImagingExaminationReport
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ExamReportInfo record);
}