package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Delivery {
    private Long id;

    private Order order;

    private Address address;

    private DeliveryStatus status; // ENUM  타입 : [READY(준비), COMP(배송)]
}
