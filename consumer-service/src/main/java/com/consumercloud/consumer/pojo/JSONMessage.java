package com.consumercloud.consumer.pojo;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 16591
 * @title: JSONMessage
 * @projectName MyGitCloud
 * @description: TODO
 * @date 2020/3/14   23:32
 */
@Getter
@Setter
@ToString
public class JSONMessage {

    public JSONObject message;

    public String code;

}
