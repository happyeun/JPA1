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

    private Delivery delivery;

    private LocalDateTime orderDate;

    // <주문 상태>
    /*
        enum 타입
        ORDER, CANCEL
     */
    private OrderStatus status;


}
