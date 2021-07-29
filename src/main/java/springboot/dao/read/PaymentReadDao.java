package springboot.dao.read;

import org.apache.ibatis.annotations.Param;
import springboot.entities.PaymentDO;
import springboot.entities.TwoTuple;
import springboot.entities.TwoTupleC;
import springboot.entities.TwoTupleD;

/**
 * @author ：chenxin
 * @date ：Created in 2020/6/20 8:59
 */
public interface PaymentReadDao {

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return cn.chenxinzouzou.mall.payment.entities.Payment 缴费信息
     * @author chenxin
     * @date 2020/6/20 10:20
     **/
    PaymentDO queryPaymentById(long id);

    TwoTupleC queryPaymentByTwoTuple(@Param("tuple") TwoTuple tuple);

    int inserttest(@Param("tuple") TwoTupleD tuple);
}
