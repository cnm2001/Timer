package com.ess.timer;


import com.ess.timer.domain.Category;
import com.ess.timer.domain.Event;
import com.ess.timer.service.EventRepository;
import com.ess.timer.domain.Usr;
import com.ess.timer.service.UsrRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToOneTest {
    @Autowired
    UsrRepository urep;
    @Autowired
    EventRepository erep;

    //插入
    @Test
    public void test01() {
        Usr usr = new Usr();
        usr.setUsrName("张三");
        urep.save(usr);
        usr= new Usr();
        usr.setUsrName("里斯");
        urep.save(usr);
        Event event = new Event();
        event.setDescription("睇戏");
        event.setCategory(Category.ENTERTAINMENT);
        erep.save(event);
        event = new Event();
        event.setCategory(Category.BREAKING);
        event.setDescription("饮茶");
        erep.save(event);
        event=new Event();
        event.setCategory(Category.FORLIVING);
        event.setDescription("返工");
        erep.save(event);
    }

    @Test
    public void test02() {

    }
}
