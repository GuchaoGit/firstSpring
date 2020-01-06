package com.guc.fristspring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author guc
 * @Date 2020/1/6 16:08
 * @Description Spring Collections - 集合类型的 Bean
 * 四种主要的集合类型: List Set Map Properties
 */
public class Customer {
    private List<Object> lists;//这里的lists要和Bean中property标签的name一样
    private Set<Object> sets;
    private Map<Object, Object> maps;
    private Properties pros;
    private Person person;//不要忘记写内部要引用的 Bean

    public Customer() {
    }

    public Customer(Person person) {
        this.person = person;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer [person=" + person + "]";
    }
}
