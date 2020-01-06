package com.guc.fristspring.loosely_coupled;

/**
 * @Author guc
 * @Date 2020/1/6 14:19
 * @Description CSV 输出，实现了 IOutputGenerator 接口
 */
public class CsvOutputGenerator implements IOutputGenerator{
    @Override
    public void generateOutput() {
        System.out.println("Creating CsvOutputGenerator  Output......");
    }
}
