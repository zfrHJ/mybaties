package com.itheima.mybatits.mapper;

import java.util.List;

import com.itheima.mybatits.po.Orders;

public interface OrdersMapperCustom {
	// ��ѯ������������ϸ��Ϣ
		public List<Orders> findOrdersUserDetailList() throws Exception;
}
