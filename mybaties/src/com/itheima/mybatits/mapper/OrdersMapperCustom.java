package com.itheima.mybatits.mapper;

import java.util.List;

import com.itheima.mybatits.po.Orders;

public interface OrdersMapperCustom {
	// 查询订单及订单明细信息
		public List<Orders> findOrdersUserDetailList() throws Exception;
}
