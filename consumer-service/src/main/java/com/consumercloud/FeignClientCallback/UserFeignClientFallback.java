package com.consumercloud.FeignClientCallback;

import com.alibaba.fastjson.JSONObject;
import com.consumercloud.consumer.pojo.JSONMessage;
import com.consumercloud.consumer.pojo.User;
import com.consumercloud.interfaceTack.UserFeignClient;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public JSONMessage queryById(Long id) {
        JSONMessage user=new JSONMessage();
        user.setCode("500");
        user.setMessage(JSONObject.parseObject("用户查询出现异常！"));
        return user;
    }

    @Override
    public JSONMessage queryUserNameById(Long id) {
        JSONMessage user=new JSONMessage();
        user.setCode("500");
        user.setMessage(JSONObject.parseObject("用户查询出现异常！"));
        return user;
    }
}