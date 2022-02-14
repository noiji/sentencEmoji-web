package hellospring.demo.service;

import hellospring.demo.domain.Member;
// import hellospring.demo.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    // MemoryMemberRepository memberRepository;

    @BeforeEach
    //각 테스트 실행 전에 호출된다. 테스트가 서로 영향이 없도록 항상 새로운 객체를 생성하고,
    //의존관계도 새로 맺어준다
    // public void beforeEach(){
    //     memberRepository = new MemoryMemberRepository();
    //     memberService = new MemberService(memberRepository);
    // }

    @AfterEach
    public void afterEach(){
        // memberRepository.clearStore();
    }

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("jihyeon");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void duplicate_member(){
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        memberService.join(member1);

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("The member already exists.");

//        위의 assertThrows가 아래를 대체
//        try {
//            memberService.join(member2);
//            fail("Exception should have been made.");
//        } catch(IllegalStateException e){
//            assertThat(e.getMessage()).isEqualTo("The member already exists.");
//        }

    }

    @Test
    void findMembers() {
        //given
        Member member = new Member();
        member.setName("jihyeon");

        //when
        Long result = memberService.join(member);

        //then
        assertThat(result).isEqualTo(member);
    }

    @Test
    void findOne() {
        //given
        Member member = new Member();
        member.setId(1L);

        //when
        Optional<Member> result = memberService.findOne(member.getId());

        //then
        assertThat(result).isEqualTo(result);
    }
}