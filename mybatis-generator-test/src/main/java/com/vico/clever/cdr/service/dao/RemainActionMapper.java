package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.RemainAction;

public interface RemainActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Remain
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Remain
     *
     * @mbggenerated
     */
    int insert(RemainAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Remain
     *
     * @mbggenerated
     */
    int insertSelective(RemainAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Remain
     *
     * @mbggenerated
     */
    RemainAction selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Remain
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RemainAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Action_Remain
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RemainAction record);
}