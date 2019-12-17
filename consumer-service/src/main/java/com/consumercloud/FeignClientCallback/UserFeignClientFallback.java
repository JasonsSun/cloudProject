package com.consumercloud.FeignClientCallback;

import com.consumercloud.consumer.pojo.User;
import com.consumercloud.interfaceTack.UserFeignClient;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryById(Long id) {
        User user=new User();
        user.setId(id);
        user.setName("⽤用户查询出现异常！");
        return user;
    }
}