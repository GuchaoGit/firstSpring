package com.guc.fristspring.beanIoc;

/**
 * @Author guc
 * @Date 2020/1/6 11:47
 * @Description 人
 * Spring Inner Bean - 内部嵌套的 Bean
 */
public class Person {
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", name=" + name + "]";
    }
}
