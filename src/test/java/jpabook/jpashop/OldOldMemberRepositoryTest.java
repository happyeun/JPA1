package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OldOldMemberRepositoryTest {
    /*  라이브러리
            스프링테스트니까 -> 스프링부트의 테스트 라이브러리 SpringBootTest
            Junit로 할 꺼니까 -> Junit에게 알려주기 :  Runwith(Springrunner.class)
     */
    @Autowired
    Old_MemberRepository oldMemberRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {

        //given
        Old_Member oldMember = new Old_Member();
        oldMember.setUsername("memberA");

        //when
        Long savedId = oldMemberRepository.save(oldMember);
        Old_Member findOldMember = oldMemberRepository.find(savedId);

        //then
            /*  스프링이 가지고 있는 org.asserj.core.api를 사용
            *   검증하기
            * */
        Assertions.assertThat(findOldMember.getId()).isEqualTo(oldMember.getId());
        Assertions.assertThat(findOldMember.getUsername()).isEqualTo(oldMember.getUsername());
    }

}