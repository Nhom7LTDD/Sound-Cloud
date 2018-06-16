package com.bin.soundcloud.Data;
import java.io.IOException;

/**
 * Created by Administrator on 4/5/2018.
 */

public class Contact {
    int id, age;
    String email, pass, sex;

    public int getId() {
        return id;
    }

    public void setId(int id)

    {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
