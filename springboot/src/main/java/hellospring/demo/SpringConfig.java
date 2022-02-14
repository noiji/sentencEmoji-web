package hellospring.demo;

//import hellospring.demo.repository.JdbcTemplateMemberRepository;
//import hellospring.demo.repository.JpaMemberRepository;
import hellospring.demo.repository.MemberRepository;
import hellospring.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// import javax.persistence.EntityManager;
// import javax.sql.DataSource;
// import javax.swing.*;

@Configuration
public class SpringConfig {

    //spring jpa로 jpa 대체
    private final MemberRepository memberRepository;

    @Autowired //생성자 하나여서 생략해도 됨
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

//    //jpa 사용시 필요
//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em){
//        this.em = em;
//    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//// return new MemoryMemberRepository();
//// return new JdbcMemberRepository(dataSource);
////        return new JdbcTemplateMemberRepository(dataSource);
////        return new JpaMemberRepository(em);
//
//    }
}