package springboot.service.write.impl;

import cn.chenxinzouzou.mall.payment.dao.write.PaymentWriteDao;
import cn.chenxinzouzou.mall.payment.entities.PaymentDO;
import cn.chenxinzouzou.mall.payment.service.write.PaymentWriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 缴费写操作业务实现类
 *
 * @author ：chenxin
 * @date ：Created in 2020/6/20 10:30
 */
@Service
public class PaymentWriteServiceImpl implements PaymentWriteService {

    @Resource
    private PaymentWriteDao paymentWriteDao;

    @Override
    public int insertPayment(PaymentDO paymentDO) {
        return paymentWriteDao.insertPayment(paymentDO);
    }
}
