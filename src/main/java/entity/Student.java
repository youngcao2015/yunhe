package entity;

import java.io.Serializable;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午6:16 18/6/23
 */
public class Student implements Serializable {
    private Long id;

    private String name;

    private Integer age;

    private Integer classId;

    private String sex;


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
