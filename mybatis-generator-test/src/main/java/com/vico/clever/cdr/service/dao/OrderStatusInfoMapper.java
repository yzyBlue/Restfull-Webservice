package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.OrderStatusInfo;

public interface OrderStatusInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Action_Order
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Action_Order
	 * @mbggenerated
	 */
	int insert(OrderStatusInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Action_Order
	 * @mbggenerated
	 */
	int insertSelective(OrderStatusInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Action_Order
	 * @mbggenerated
	 */
	OrderStatusInfo selectByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Action_Order
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(OrderStatusInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Action_Order
	 * @mbggenerated
	 */
	int updateByPrimaryKey(OrderStatusInfo record);
}