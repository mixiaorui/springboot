package com.sorry.start.annotation;

@TableName("user")
public class User {
    @Column(name = "name", value = "sry")
    private String name;

    @Column(name = "age", value = "24")
    private Integer age;

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

}
