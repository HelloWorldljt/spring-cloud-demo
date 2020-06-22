package com.springcloud.businessserver.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.springcloud.businessserver.model.Order;
import com.springcloud.businessserver.dao.OrderMapper;
@Service
public class OrderService{

    @Resource
    private OrderMapper orderMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Order record) {
        return orderMapper.insert(record);
    }

    
    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }

    
    public Order selectByPrimaryKey(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }

}
