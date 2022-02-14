package hellospring.demo.service;

import hellospring.demo.domain.Member;
import hellospring.demo.repository.MemberRepository;
//import hellospring.demo.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional //jpa 사용시 필수적
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    //스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어준다. 이렇게
    //객체 의존관계를 외부에서 넣어주는 것을 DI (Dependency Injection), 의존성 주입이라 한다.
    //생성자가 1개만 있으면 @Autowired 는 생략할 수 있다.
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //member join
    public Long join(Member member){
        //do not accept member with same name
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("The member already exists.");
                });
    }

    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
