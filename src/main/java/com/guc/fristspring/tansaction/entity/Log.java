package com.guc.fristspring.tansaction.entity;

/**
 * @Author guc
 * @Date 2020/1/14 9:26
 * @Description 日志
 */
public class Log {
    private int id;
    private int site_id;
    private int count;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSite_id() {
        return site_id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " +id+
                ",site_id = " +site_id+
                ",count = " +count+
                ",date = " +date+
                "}";
    }
}
