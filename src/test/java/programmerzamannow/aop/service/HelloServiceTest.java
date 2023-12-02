package programmerzamannow.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {

        Assertions.assertEquals("Hello gils", helloService.hello("gils"));
        Assertions.assertEquals("Hello Gilang Maulana", helloService.hello("Gilang" , "Maulana"));
        Assertions.assertEquals("Bye gils", helloService.bye("gils"));

        helloService.test();
    }
}
