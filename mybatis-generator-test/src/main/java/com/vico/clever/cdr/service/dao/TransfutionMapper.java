package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Transfution;

public interface TransfutionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Transfusion
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Transfusion
     *
     * @mbggenerated
     */
    int insert(Transfution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Transfusion
     *
     * @mbggenerated
     */
    int insertSelective(Transfution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Transfusion
     *
     * @mbggenerated
     */
    Transfution selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Transfusion
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Transfution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_Transfusion
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Transfution record);
}