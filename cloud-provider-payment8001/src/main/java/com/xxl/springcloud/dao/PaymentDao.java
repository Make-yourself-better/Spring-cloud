package com.xxl.springcloud.dao;

import entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 */
@Mapper
//@Repository不用Spring的
public interface PaymentDao
{
     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
