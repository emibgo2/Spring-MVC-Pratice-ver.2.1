package hello.login;

import hello.login.domain.item.Item;
import hello.login.domain.item.ItemRepository;
import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
@AllArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;
    
    public static List<Integer> myUUID =Collections.synchronizedList(new ArrayList<Integer>());


    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
//
//        for (int i = 1000; i < 10000; i++) {
//            myUUID2.add(i);
//        }
//        Iterator<Integer> iterator = myUUID2.iterator();
//        while (iterator.hasNext()) System.out.println("myUUID:  "+ iterator.next());
//


//        for (int i = 1000; i < 10000; i++) {
//            myUUID.add(i);
//        }

        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));

        Member member = new Member();
        member.setLoginId("test");
        member.setPassword("test!");
        member.setName("테스터");

        memberRepository.save(member);
    }

}