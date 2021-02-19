package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao
{
    // @Mapper 和 @Repository注解有差别，多用前一个
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}