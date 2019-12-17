package com.usercloud.user.pojo;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "tb_user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // ⽤用户名
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;
    // 年年龄
    private Integer age;
    // 性别，1男性，2⼥女女性
    private Integer sex;
    // 出⽣生⽇日期
    @Temporal(TemporalType.DATE)
    private Date birthday;
    // 创建时间
    @Temporal(TemporalType.DATE)
    private Date created;
    // 更更新时间
    @Temporal(TemporalType.DATE)
    private Date updated;
    // 备注
    private String note;
}