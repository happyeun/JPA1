package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable /* 어노케이션: 다른 곳에 내장될 수 있다. 임베디드 타입이라는 뜻 */
@Getter @Setter
public class Address {

    private String city;
    private String street;
    private String zipcode;

}
