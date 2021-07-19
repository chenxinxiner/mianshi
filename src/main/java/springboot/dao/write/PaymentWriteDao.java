package springboot.dao.write;

import cn.chenxinzouzou.mall.payment.entities.PaymentDO;

/**
 * @author ：chenxin
 * @date ：Created in 2020/6/20 8:59
 */
public interface PaymentWriteDao {
    /**
     * 插入缴费信息
     *
     * @param paymentDO 缴费信息实体
     * @return int 数据库修改的行数
     * @author chenxin
     * @date 2020/6/20 10:32
     **/
    int insertPayment(PaymentDO paymentDO);
}
