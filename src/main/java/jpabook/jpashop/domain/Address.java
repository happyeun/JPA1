package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

/* @Embeddable
    다른 곳에 내장될 수 있다.
    해당 클래스 임베디드 타입이라는 뜻 */
@Embeddable
@Getter @Setter
public class Address {

    private String city;
    private String street;
    private String zipcode;

}
