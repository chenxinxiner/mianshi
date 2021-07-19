package springboot.hyscommand;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import springboot.entities.PaymentDO;
import springboot.util.HttpClientUtil;

public class PaymentInfoCommand extends HystrixCommand<PaymentDO> {

    private Long id;

    public PaymentInfoCommand(Long id) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("PaymentInfoService")));
        this.id = id;
    }

    @Override
    protected PaymentDO run() throws Exception {
        String url = "http://localhost:8001/payment/get/" + id;
        String response = HttpClientUtil.sendGetRequest(url,"UTF-8");
        System.out.println(response);
        return JSONObject.parseObject(response, PaymentDO.class);
    }
}
