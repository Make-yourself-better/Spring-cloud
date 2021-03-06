package com.xxl.springcloud.service.Impl;


import com.xxl.springcloud.dao.PaymentDao;
import com.xxl.springcloud.service.PaymentService;


import entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
