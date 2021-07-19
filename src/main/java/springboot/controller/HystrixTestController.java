package springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.hyscommand.PaymentInfoCommand;

@RestController
public class HystrixTestController {

    @GetMapping("commandGetPayment")
    public String testGetCommand() {
        PaymentInfoCommand paymentInfoCommand = new PaymentInfoCommand(1L);
        return paymentInfoCommand.toString();
    }

}
