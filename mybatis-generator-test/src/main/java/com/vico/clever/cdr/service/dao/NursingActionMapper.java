package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.NursingAction;

public interface NursingActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Nursing
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Nursing
     *
     * @mbggenerated
     */
    int insert(NursingAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Nursing
     *
     * @mbggenerated
     */
    int insertSelective(NursingAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Nursing
     *
     * @mbggenerated
     */
    NursingAction selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Nursing
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NursingAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Nursing
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NursingAction record);
}