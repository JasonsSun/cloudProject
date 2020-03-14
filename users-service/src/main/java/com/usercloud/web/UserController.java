package com.usercloud.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.consumercloud.consumer.pojo.JSONMessage;
import com.consumercloud.interfaceTack.UserFeignClient;
import com.usercloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController implements UserFeignClient {
    @Autowired
    private UserService userService;

    @Override
    @GetMapping("/{id}")
    public JSONMessage queryById(@PathVariable("id") Long id) {
        JSONMessage jsonMessage=new JSONMessage();
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(this.userService.queryById(id));
        jsonMessage.setMessage(jsonObject);
        jsonMessage.setCode("200");
        return jsonMessage;
    }

    @Override
    @GetMapping("/name/{id}")
    public JSONMessage queryUserNameById(@PathVariable("id") Long id) {
        JSONMessage jsonMessage=new JSONMessage();
        String UserName=this.userService.queryById(id).getName();
        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("Name",UserName);
        JSONObject itemJSONObj = JSONObject.parseObject(JSON.toJSONString(hashmap));
        jsonMessage.setMessage(itemJSONObj);
        jsonMessage.setCode("200");
        return jsonMessage;
    }
}