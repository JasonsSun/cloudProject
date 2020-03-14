package com.consumercloud.interfaceTack;

import com.consumercloud.FeignClientCallback.UserFeignClientFallback;
import com.consumercloud.LogConfig.FeignConfigLog;
import com.consumercloud.consumer.pojo.JSONMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service", fallback = UserFeignClientFallback.class,configuration = FeignConfigLog.class)
public interface UserFeignClient {
    @GetMapping("user/{id}")
    JSONMessage queryById(@PathVariable("id") Long id);
    @GetMapping("user/name/{id}")
    JSONMessage queryUserNameById(@PathVariable("id") Long id);
}