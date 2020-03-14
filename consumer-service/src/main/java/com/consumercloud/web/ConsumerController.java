package com.consumercloud.web;

import com.consumercloud.consumer.pojo.JSONMessage;
import com.consumercloud.consumer.pojo.User;
import com.consumercloud.interfaceTack.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("consumer")
//@DefaultProperties(defaultFallback = "defaultFallback")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private UserFeignClient userFeignClient;

//    @GetMapping("{id}")
//    @HystrixCommand(fallbackMethod = "queryByIdFallback")
//    @HystrixCommand(commandProperties =
//            {@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
//                    @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value =
//                            "10000"),
//                    @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value =
//                            "60"),})
//    public User queryById(@PathVariable("id") Long id){
//        //根据服务ID获取实例例
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//        //从实例例中取出IP和端⼝口
//                ServiceInstance instance = instances.get(0);
//        //String url="http://127.0.0.1:8081/user/"+id;
//        String url="http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;
//        User user=restTemplate.getForObject(url,User.class);
//        return user;
//    }

//    public String defaultFallback(){
//        return "对不不起，服务器器太拥挤了";
//    }

//    public String queryByIdFallback(Long id) {
//        log.error("查询⽤用户信息失败,id:{ }",id);
//        return "对不不起，服务器器太拥挤了了";
//    }

    @GetMapping("{id}")
    public JSONMessage queryById(@PathVariable("id") Long id) {
        return userFeignClient.queryById(id);
    }

    @GetMapping("/name/{id}")
    public JSONMessage queryUserNameById(@PathVariable("id") Long id) {
        return userFeignClient.queryUserNameById(id);
    }

}