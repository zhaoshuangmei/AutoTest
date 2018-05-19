package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//管理本次套件测试代码
//suitconfig进行我们所有遇测试套件的配置
//loginTest逻辑控制类，写我们主要的测试主要的test标签的下的方法
// suitconfig写我们测试套件之前需要运行的方法，共有的方法
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了");
    }
    @AfterSuite
    public void  aferterSuite(){
        System.out.println("after suite 运行了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }
    @AfterTest
    public  void  afterTest(){
        System.out.println("after Test");
    }
}
