package com.guc.fristspring.loosely_coupled;

/**
 * @Author guc
 * @Date 2020/1/6 14:21
 * @Description 用 Spring 的松耦合实现输出相应的格式
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;
    public void generateOutput(){
        if (outputGenerator!=null) outputGenerator.generateOutput();
    }
    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
