package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.Table;


/*
   @Table에서 name을 써주는 이유,
   테이블 이름이 orders이니까,
   엔터티 이름은 order라서 안써주면, 테이블이 order인줄 안다.
 */
@Entity
@Table(name="orders")
public class Order {


}
