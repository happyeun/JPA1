package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


public enum DeliveryStatus {
    READY, COMP

    /*
        READY : 준비
        COMP : 배송
     */
}
