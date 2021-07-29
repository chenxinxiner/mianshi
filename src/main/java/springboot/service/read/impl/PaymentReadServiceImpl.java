package springboot.service.read.impl;

import org.springframework.stereotype.Service;
import springboot.dao.read.PaymentReadDao;
import springboot.entities.PaymentDO;
import springboot.service.read.PaymentReadService;

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
