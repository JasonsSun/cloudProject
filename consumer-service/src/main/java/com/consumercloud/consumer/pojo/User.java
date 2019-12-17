package com.consumercloud.consumer.pojo;

import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    //ID
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
//    @Temporal(TemporalType.DATE)(精确到年月日)
//    @Temporal(TemporalType.TIME)(精确到时分秒)
//    @Temporal(TemporalType.TIMESTAMP)(默认年月日时分秒)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}