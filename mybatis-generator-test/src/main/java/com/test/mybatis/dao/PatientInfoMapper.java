package com.test.mybatis.dao;

import com.test.mybatis.model.PatientInfo;

public interface PatientInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Person_Patient
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Person_Patient
	 * @mbggenerated
	 */
	int insert(PatientInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Person_Patient
	 * @mbggenerated
	 */
	int insertSelective(PatientInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Person_Patient
	 * @mbggenerated
	 */
	PatientInfo selectByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Person_Patient
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(PatientInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Person_Patient
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PatientInfo record);
}