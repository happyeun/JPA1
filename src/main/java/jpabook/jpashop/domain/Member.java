package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name="member_id")  //테이블의 컬럼값 이름 (이 강의에서는 자바코드에선 소문자로 입력)
    private Long id;
    private String name;

    /* 임베디드 사용하기 위한 어노테이션
        Embedded를 여기다가 하거나,
        Address 클래스 Embeddable

        둘 중에 하나만 해도 괜찮다.
        하지만 보통 두개 다 사용하는 방식으로 사용된다.
     */
    @Embedded
    private Address address;

    private List<Order> orders = new ArrayList<>();
}
