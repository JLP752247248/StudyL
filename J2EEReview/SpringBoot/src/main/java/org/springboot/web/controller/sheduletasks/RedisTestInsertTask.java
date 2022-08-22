package org.springboot.web.controller.sheduletasks;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Set;

@Component
public class RedisTestInsertTask {

    @Resource(name = "redisTemplate")
    RedisTemplate template;
    @Scheduled(cron = "*/1 * * * * ?")
    public void insert (){
       Set s= template.keys("*");
       System.out.println(s);
    }
}
