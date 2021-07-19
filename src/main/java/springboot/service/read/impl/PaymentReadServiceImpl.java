package springboot.service.read.impl;

import cn.chenxinzouzou.mall.payment.dao.read.PaymentReadDao;
import cn.chenxinzouzou.mall.payment.entities.PaymentDO;
import cn.chenxinzouzou.mall.payment.service.read.PaymentReadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 缴费只读业务实现类
 *
 * @author ：chenxin
 * @date ：Created in 2020/6/20 10:28
 */
@Service
public class PaymentReadServiceImpl implements PaymentReadService {

    @Resource
    private PaymentReadDao paymentReadDao;

    @Override
    public PaymentDO queryPaymentById(long id) {
        return paymentReadDao.queryPaymentById(id);
    }
}
