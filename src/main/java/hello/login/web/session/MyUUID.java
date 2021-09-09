package hello.login.web.session;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyUUID {
    public List<Integer> myUUID = new ArrayList<>();



    public List<Integer> create(int start, int end) {
        for (int i = start; i < end; i++) {
            myUUID.add(i);
        }
        return myUUID;
    }
}
