package springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.entities.PaymentDO;
import springboot.service.read.PaymentReadService;
import springboot.service.write.PaymentWriteService;

import javax.annotation.Resource;

/**
 * @author ：chenxin
 * @date ：Created in 2020/6/20 12:51
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentReadService paymentReadService;

    @Resource
    private PaymentWriteService paymentWriteService;

    @Value("${server.port}")
    private String port;

    @GetMapping("payment/get/{id}")
    public PaymentDO getPayment(@PathVariable("id") long id) {
        PaymentDO paymentDO = paymentReadService.queryPaymentById(id);
        return paymentDO;
    }


}
