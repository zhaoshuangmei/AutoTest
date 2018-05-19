package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
         System.out.println("Test这是测试的一部分");
    }
    //alt+回车导入包类
    //alt+回车  添加test标签
    //common+J  联想system sout
    @Test
    public  void  testCase2(){
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
     @AfterMethod
     public  void afterMethod(){
         System.out.println("AfterMethod这是在测试方法之前运行的");

     }
     //类正式运行前是否需要注册对象，静态对象，赋值
     @BeforeClass
    public  void  beforeClass(){
         System.out.println("BeforeClass这是在类运行之前运行的方法");

     }
     @AfterClass
    public  void afterClass() {
         System.out.println("AfterClass这是在类运行之后运行的方法");
     }
    //什么时候执行
    @BeforeSuite
    public  void  beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}