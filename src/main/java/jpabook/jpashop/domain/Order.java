package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/*
   @Table에서 name을 써주는 이유,
   테이블 이름이 orders이니까,
   엔터티 이름은 order라서 안써주면, 테이블이 order인줄 안다.
 */
@Entity
@Table(name="orders")
public class Order {

    // < PK:  ORDER_ID >
    @Id @GeneratedValue
    @Column(name="order_id")
    private Long id;

    // < Member와의 관계 설정 >
    /*
        @ManyToOne :  Order입장에서는 다대일
        @JoinColum :  Member와의 매핑될 때, FK 이름 설정
     */
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="delivery_id")
    private Delivery delivery;
    /* 연관관계 주인
        FK가 어디에 넣어도 상관없을 때는,
        어느쪽에서 탐색하는지 생각해보자.

        강의자 스타일은 많이 엑세스 되는 곳을 기준으로 한다고 한다.
        Order에서 Delivery를 탐색하는 경우가 많다. 따라서 Order를 연관관계 주인으로 두었다.

        따라서 테이블 설계에서도
        Delivery가 Order를 FK로 참조하는게 아닌
        Order가 Delivery를 FK로 참조하고 있다.
     */

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;  // ORDER, CANCEL


}
