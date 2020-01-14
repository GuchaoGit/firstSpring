package com.guc.fristspring.tansaction.entity;

import java.util.Arrays;
import java.util.List;

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
    private List<Log> logs;

    public Website() {
    }

    public Website(int id, String name, String url, String country) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.country = country;
    }

    public List<Log> getLogs() {
        return logs;
    }

    public void setLogs(List<Log> logs) {
        this.logs = logs;
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
                "id = " + id +
                ",name = " + name +
                ",url = " + url +
                ",country = " + country +
                ",logs = " + logToString(logs) +
                "}";
    }

    private String logToString(List<Log> logs) {
        StringBuilder sb = new StringBuilder();
        if (logs == null || logs.size()==0) sb.append("null");
        else
            for (Log log : logs) {
                sb.append(log.toString());
                sb.append(",");
            }
        int ifdelIndex = sb.lastIndexOf(",");
        if (ifdelIndex != -1)
            sb.deleteCharAt(ifdelIndex);
        return sb.toString();
    }
}
