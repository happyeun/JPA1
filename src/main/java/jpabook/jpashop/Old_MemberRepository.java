package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository /* 스프링이 제공하는 기본 컴포넌트 대상. Repository안에 @Component가 있다. */
public class Old_MemberRepository {
    /* "Repository"
       엔티티 같은 것을 찾아준다. DAO랑 비슷하다.
     */

    @PersistenceContext  /* 스프링부트가 알아서 엔터티매니저를 주입시켜준다. */
    private EntityManager em;

    public Long save(Old_Member oldMember){
        em.persist(oldMember);
        return oldMember.getId();
        // 코딩 스타일
            /*
                의문점: member객체를 반환하지 않고, id만 반환하는 이유
                    -> 강사의 코딩원칙 때문에
                코딩원칙:  커맨드와 쿼리를 분리하라.
                    저장하는 커맨드랑 조회쿼리를 분리하기 위해서, member반환하는 조회를 같이 하지 않는다.
                    대신 어떤게 저장되었는지 정도는 알게하기위해. Id정도는 반환시킨다.
             */
    }

    public Old_Member find(Long id){
        return em.find(Old_Member.class, id);
    }

    // 이후에 단위테스트 코드 만들기 :  단축키 Shift + Ctrl + T
}
