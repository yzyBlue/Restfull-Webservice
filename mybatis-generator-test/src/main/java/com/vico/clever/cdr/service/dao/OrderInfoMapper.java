package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.OrderInfo;

public interface OrderInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Order
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Order
	 * @mbggenerated
	 */
	int insert(OrderInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Order
	 * @mbggenerated
	 */
	int insertSelective(OrderInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Order
	 * @mbggenerated
	 */
	OrderInfo selectByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Order
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(OrderInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Inst_Order
	 * @mbggenerated
	 */
	int updateByPrimaryKey(OrderInfo record);
}