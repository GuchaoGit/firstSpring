package com.guc.fristspring.tansaction.entity;

/**
 * @Author guc
 * @Date 2020/1/9 11:47
 * @Description 网址bean
 */
public class Website {
    private int id;
    private String name;
    private String url;
    private String country;

    public Website(){}

    public Website(int id, String name, String url, String country){
        this.id = id;
        this.name = name;
        this.url = url;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " +id+
                ",name = " +name+
                ",url = " +url+
                ",country = " +country+
                "}";
    }
}
