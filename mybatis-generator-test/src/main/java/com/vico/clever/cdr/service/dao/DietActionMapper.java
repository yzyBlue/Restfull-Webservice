package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.DietAction;

public interface DietActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Diet
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Diet
     *
     * @mbggenerated
     */
    int insert(DietAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Diet
     *
     * @mbggenerated
     */
    int insertSelective(DietAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Diet
     *
     * @mbggenerated
     */
    DietAction selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Diet
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DietAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Diet
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DietAction record);
}