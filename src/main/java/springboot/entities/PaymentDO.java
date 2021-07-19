package springboot.entities;

import java.io.Serializable;

/**
 * 支付订单实体类
 *
 * @author ：chenxin
 * @date ：Created in 2020/6/20 8:53
 */
public class PaymentDO implements Serializable {

    /**
     * 主键
     */
    private long id;

    /**
     * 流水号
     */
    private String serial;

    public PaymentDO(long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public PaymentDO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "PaymentDO{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}


