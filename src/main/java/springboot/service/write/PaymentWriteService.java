package springboot.service.write;

import cn.chenxinzouzou.mall.payment.entities.PaymentDO;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：chenxin
 * @date ：Created in 2020/6/20 9:19
 */
public interface PaymentWriteService {

    /**
     * 插入缴费信息
     *
     * @param paymentDO 缴费信息实体
     * @return int 数据库修改的行数
     * @author chenxin
     * @date 2020/6/20 10:32
     **/
    int insertPayment(@Param("payment") PaymentDO paymentDO);
}
