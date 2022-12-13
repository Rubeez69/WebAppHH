package org.organey.data.dao;

import java.util.List;

import org.organey.data.model.Order_detail;


public interface OrderDetailDao {
	public void insert(Order_detail order_detail);
	public void update(Order_detail order_detail);
	public void delete(int order_detailId);
	public Order_detail find(int order_detailId);
	public List<Order_detail> findAll();
}
