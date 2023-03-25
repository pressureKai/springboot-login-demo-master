package com.springboot.springbootlogindemo.domain;

import javax.persistence.*;

@Table(name = "recoder")
@Entity
public class Recoder {
    // 注意属性名要与数据表中的字段名一致
    // 主键自增int(10)对应long
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;


    // 用户名属性varchar对应String
    private String phone;


    // 用户名属性varchar对应String
    private String project;

    // 密码属性varchar对应String
    private String time;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
