package com.ess.timer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TimerApplicationTests {

    @Test
    void contextLoads() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.checkout();

    }

}
