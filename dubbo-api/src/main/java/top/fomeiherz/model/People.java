package top.fomeiherz.model;

import java.io.Serializable;

public class People implements Serializable {

    private static final long serialVersionUID = 1340681004322688256L;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
