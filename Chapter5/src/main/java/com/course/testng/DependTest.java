package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    //前置条件比如 需要登录才可以，购买东西

    @Test
    public  void  test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = { "test1" })
    public void  test2(){
        System.out.printf("test2 run");
    }
}
