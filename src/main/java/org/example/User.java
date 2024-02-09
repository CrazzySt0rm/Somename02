package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="userService")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String username;

    @Column
    private String passwordEncoded;

    @Column
//    private int age;
    private String age;

    @Column
    private long roleId;

    public User() {}

//    public User(long id, String username, String passwordEncoded, int age, long roleId) {
    public User(long id, String username, String passwordEncoded, String age, long roleId) {
        this.id = id;
        this.username = username;
        this.passwordEncoded = passwordEncoded;
        this.age = age;
        this.roleId = roleId;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordEncoded() {
        return passwordEncoded;
    }

    public void setPasswordEncoded(String passwordEncoded) {
        this.passwordEncoded = passwordEncoded;
    }

//    public int getAge() {
    public String getAge() {
        return age;
    }

//    public void setAge(int age) {
    public void setAge(String age) {
        this.age = age;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwordEncoded='" + passwordEncoded + '\'' +
                ", age=" + age +
                ", roleId=" + roleId +
                '}';
    }
}
