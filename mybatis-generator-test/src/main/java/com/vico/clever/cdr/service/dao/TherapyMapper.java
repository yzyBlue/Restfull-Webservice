package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Therapy;

public interface TherapyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Therapy
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Therapy
     *
     * @mbggenerated
     */
    int insert(Therapy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Therapy
     *
     * @mbggenerated
     */
    int insertSelective(Therapy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Therapy
     *
     * @mbggenerated
     */
    Therapy selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Therapy
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Therapy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Therapy
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Therapy record);
}