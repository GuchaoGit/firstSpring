package com.guc.fristspring.jdbc;

import com.guc.fristspring.jdbc.entity.Website;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/9 11:46
 * @Description AppJDBC 测试
 */
public class App {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringJDBC.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        //插入
//        int count = insert(jdbcTemplate);
//        if (count>0){
//            System.out.println("插入成功 "+ count);
//        }

//        //删除
//        int countDel = delete(jdbcTemplate, 7);
//        if (countDel > 0) {
//            if (countDel > 0) {
//                System.out.println("删除成功 " + countDel);
//            }
//        }
        //修改
//        int countUpdate = update(jdbcTemplate,8);
//        if (countUpdate > 0) {
//            if (countUpdate > 0) {
//                System.out.println("修改成功 " + countUpdate);
//            }
//        }

        //查询
        List<Website> datas = query(jdbcTemplate,Website.class);
        if (datas != null) {
            for (Website website : datas) {
                System.out.println(website);
            }
        }
    }

    //插入
    private static int insert(JdbcTemplate jdbcTemplate) {
        String sql = "insert into websites values(null,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{"中国铁路", "https://www.12306.cn", "CN"});
    }

    //删除
    private static int delete(JdbcTemplate jdbcTemplate, int id) {
        String sql = "delete from websites where id=?";
        return jdbcTemplate.update(sql, id);
    }

    //更新
    private static int update(JdbcTemplate jdbcTemplate,int id){
        String sql="update websites set name=?,url=? where id=?";
        return jdbcTemplate.update(sql,"中国铁路12306","https://www.12306.cn",id);
    }

    //查询
    private static <T> List<T> query(JdbcTemplate jdbcTemplate,Class e){
        String sql = "select * from websites";
        RowMapper<T> rowMapper=new BeanPropertyRowMapper<T>(e);
        return jdbcTemplate.query(sql, rowMapper);
    }
}
