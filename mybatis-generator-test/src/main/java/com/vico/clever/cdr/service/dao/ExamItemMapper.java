package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.ExamItem;

public interface ExamItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_ImagingExaminationRequest_ExamItem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_ImagingExaminationRequest_ExamItem
     *
     * @mbggenerated
     */
    int insert(ExamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_ImagingExaminationRequest_ExamItem
     *
     * @mbggenerated
     */
    int insertSelective(ExamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_ImagingExaminationRequest_ExamItem
     *
     * @mbggenerated
     */
    ExamItem selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_ImagingExaminationRequest_ExamItem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ExamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Inst_ImagingExaminationRequest_ExamItem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ExamItem record);
}