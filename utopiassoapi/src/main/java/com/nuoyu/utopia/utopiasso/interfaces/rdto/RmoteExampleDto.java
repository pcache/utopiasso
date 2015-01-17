package com.nuoyu.utopia.utopiasso.interfaces.rdto;

import java.io.Serializable;

/**
 * Created by liuxin3 on 2015/1/17.
 */
public class RmoteExampleDto implements Serializable{

    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
