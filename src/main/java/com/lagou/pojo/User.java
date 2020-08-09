package com.lagou.pojo;

/**
 * @author xiongsm
 */
public class User {
    private Integer id;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    public User(Integer id) {
        this.id = id;
    }

    private String name;
}
