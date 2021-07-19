package springboot.service.read;


import springboot.entities.PaymentDO;

/**
 * 支付业务
 *
 * @author ：chenxin
 * @date ：Created in 2020/6/20 9:19
 */
public interface PaymentReadService {

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return cn.chenxinzouzou.mall.payment.entities.Payment 缴费信息
     * @author chenxin
     * @date 2020/6/20 10:20
     **/
    PaymentDO queryPaymentById(long id);
}
