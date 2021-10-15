package com.codes.admingolekrewang.Model;

public class User {
    public String id,nama,email,password,hp;

    public User(String id, String nama, String email, String password,String hp) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.hp = hp;
    }
    public User(){}

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getHp() {
        return hp;
    }
}
