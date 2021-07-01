package javaBase.enumtest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 披萨状态枚举类
 *
 * @author ：chenxin
 * @date ：Created in 2021/7/1 22:52
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)

public class Pizza {

    private PizzaStatus status;

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public enum PizzaStatus {
        ORDERED(5) {
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY(2) {
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED(0) {
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        private int timeToDelivery;

        public boolean isOrdered() {
            return false;
        }

        public boolean isReady() {
            return false;
        }

        public boolean isDelivered() {
            return false;
        }

        @JsonProperty("timeToDelivery")
        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        private PizzaStatus (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public static void main(String[] args) {
        Pizza pz = new Pizza();
        pz.setStatus(Pizza.PizzaStatus.READY);
        // System.out.println((pz));
    }
}
