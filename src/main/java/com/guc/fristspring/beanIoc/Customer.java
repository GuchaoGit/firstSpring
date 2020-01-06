package com.guc.fristspring.beanIoc;

/**
 * @Author guc
 * @Date 2020/1/6 16:08
 * @Description Spring Inner Bean - 内部嵌套的 Bean
 */
public class Customer {
    private Person person;
    public Customer(Person p){
        this.person =  p;
    }
    public Customer(){}
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer [person=" + person + "]";
    }
}
