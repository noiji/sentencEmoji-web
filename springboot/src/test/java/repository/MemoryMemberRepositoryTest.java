//package repository;
//
//import hellospring.demo.domain.Member;
//import hellospring.demo.repository.MemberRepository;
//import hellospring.demo.repository.MemoryMemberRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class MemoryMemberRepositoryTest {
//    MemberRepository repository = new MemoryMemberRepository();
//
//    @AfterEach //test 끝날 때 마다 실행해줘야 테스트 오류 안남
//    public void afterEach(){
//        repository.clearStore();
//    }
//
//    @Test
//    public void save(){
//        Member member = new Member();
//        member.setName("spring");
//
//        repository.save(member);
//
//        Member result = repository.findById(member.getId()).get();
//        Assertions.assertEquals(member, result); //동일한지 확인. junit의 assertion 활용
//        //assertThat(member).isEqualto(result); 도 동일! 단 junit은 아님 assertj임
//    }
//
//    @Test
//    public void findByName(){
//        Member member1 = new Member();
//        member1.setName("spring1");
//        repository.save(member1);
//
//        Member member2 = new Member();
//        member2.setName("spring2");
//        repository.save(member2);
//
//        Member result = repository.findByName("spring1").get();
//
//        assertThat(result).isEqualTo(member1);
//    }
//
//    @Test
//    public void findAll(){
//        Member member1 = new Member();
//        member1.setName("spring1");
//        repository.save(member1);
//
//        Member member2 = new Member();
//        member2.setName("spring2");
//        repository.save(member2);
//
//        List<Member> result = repository.findAll();
//
//        assertThat(result.size()).isEqualTo(2);
//
//    }
//
//}
