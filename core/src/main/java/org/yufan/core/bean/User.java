package org.yufan.core.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user")
public class User {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name="name")
    private String name;

//    @Column(address="address")
    private String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
